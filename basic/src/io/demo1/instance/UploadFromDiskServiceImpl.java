//package io.demo1;
//
//import com.thunisoft.ygyd.common.entity.po.yj.YJ_Fj;
//import com.thunisoft.ygyd.common.entity.po.yj.Ypjbxx;
//import com.thunisoft.ygyd.common.entity.po.yj.yp.FjPo;
//import com.thunisoft.ygyd.common.util.IdUtil;
//import com.thunisoft.ygyd.yj.db.mapper.FjMapperExt;
//import com.thunisoft.ygyd.yj.db.mapper.YpjbxxMapperExt;
//import com.thunisoft.ygyd.yj.service.UploadFromDiskService;
//import com.thunisoft.ypjg.tcs.service.ITcsService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mock.web.MockMultipartFile;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.ObjectUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * 标题: 批量上传impl
// *
// * @Author: Jiang yuting
// * @Date: 2020/11/25 14:32
// */
//@Service
//@Slf4j
//public class UploadFromDiskServiceImpl implements UploadFromDiskService {
//
//    public static final int MAXIMUM_NUMBER_OF_PICTURES_FOR_ONE_DRUG = 5; //一个药品最多图片数量
//    public static final String FJ_YWLB = "YP_ZP"; //业务类别
//    public static final String FJ_LOCAL_DIR = "E:\\新建文件夹"; // 本地文件所在目录
//    @Autowired
//    private YpjbxxMapperExt ypjbxxMapperExt;
//    @Autowired
//    private FjMapperExt fjMapperExt;
//    @Autowired
//    ITcsService tcsService;
//
//    @Override
//    public void uploadImg() throws IOException {
//        File dir = new File(FJ_LOCAL_DIR);//文件所在本地目录
//        ArrayList<File> list = new ArrayList<>(); //文件list
//        /**获取文件集合*/
//        getFileList(dir,list);
//        ArrayList<YJ_Fj> fjlist = new ArrayList<>(); //附件信息list
//        for (File file: list) {
//            String filename = file.getName(); // pzwh+bzgg-n.jpg
//            String hz = filename.substring(filename.lastIndexOf(".")+1); // 取后缀
//            // 因为windows文件名不允许有/和*和:,因此文件名中的/替换为了=,*替换为了@,:替换为了#,在此转换回去
//            filename = filename.replace("=","/")
//                    .replace("@","*")
//                    .replace("#",":");
//            String pzwh = filename.substring(0, filename.indexOf("+"));
//            String bzgg = filename.substring(filename.indexOf("+")+1, filename.indexOf("-"));
//            //1.查询该批准文号和包装规格对应的药品表主键ypbh
//            String ypbh = getYpbhByPzwhAndBzgg(pzwh, bzgg);
//            //2.如果查到了对应ypbh,查询ypbh在附件表的业务编号ywbh是否有,且业务类别ywlb为YP_ZP,返回个数
//            if (!"".equals(ypbh)) {
//                /**查询该批准文号+包装规格的药品有几张图片了*/
//                int numOfImg = getNumOfYwbhAndYwlb(ypbh);
//                /**如果还不到五张,就上传当前图片*/
//                if (numOfImg < MAXIMUM_NUMBER_OF_PICTURES_FOR_ONE_DRUG) {
//                    /**保存附件信息*/
//                    YJ_Fj fj = new YJ_Fj();
//                    fj.setcMc(filename);
//                    fj.setcHz(hz);
//                    fj.setcYwbBh(ypbh);
//                    fj.setcYwfl("YP_ZP");
//                    fj.setcSfyx("1");
//                    fj.setcCjr("jiang-药品图片批量导入");
//                    /**上传图片至minio,获取路径*/
//                    uploadToMinio(file, fjlist ,fj);
//                }
//            } else {
//                log.error("============【批准文号:" + pzwh + ",包装规格:"+ bzgg +"---没找到对应主键.....】===========");
//            }
//        }
//        /**批量插入附件信息*/
//        if (!CollectionUtils.isEmpty(fjlist)) {
//            insertFjs(fjlist);
//        }
//        log.error("==============图片总数:"+list.size()+"张=======================");
//        log.error("==============成功上传图片:"+fjlist.size()+"张==================");
//    }
//    @Override
//    public void getFileList(File dir, ArrayList<File> list) {
//        //遍历出所有文件和文件夹的名字 返回的是数组
//        File[] files = dir.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            //判断不是隐藏文件 并且是一个文件夹
//            if(!files[i].isHidden() && files[i].isDirectory()) {
//                // 如果是文件夹就在此调用这个方法找下一级的文件夹
//                getFileList(files[i],list);
//            }else {
//                //如果不是文件夹是文件 就把后缀名是.jpg和.png的文件写入集合中
//                if(files[i].getName().endsWith(".jpg") || files[i].getName().endsWith(".png")) {
//                    list.add(files[i]);
//                }
//            }
//        }
//    }
//    @Override
//    public String getYpbhByPzwhAndBzgg(String pzwh, String bzgg) {
//        Ypjbxx ypjbxx = ypjbxxMapperExt.selectByPzwhAndBzgg(pzwh, bzgg);
//        if (ObjectUtils.isEmpty(ypjbxx)) {
//            return "";
//        }
//        return ypjbxx.getcBh();
//    }
//    @Override
//    public int getNumOfYwbhAndYwlb(String ypbh){
//        List<FjPo> fjList = fjMapperExt.selectByYwbh(ypbh,FJ_YWLB);
//        return fjList.size();
//    }
//    @Override
//    public void  uploadToMinio(File file ,ArrayList<YJ_Fj> fjlist ,YJ_Fj fj) throws IOException {
//        MultipartFile mfile = getMultipartFileByFile(file);
//        fj.setcBh(IdUtil.getUUID32());
//        String protocol = tcsService.uploadByGeneratePath(ITcsService.DEFAULT_CORP, mfile.getInputStream(), fj.getcMc());
//        fj.setcLj(protocol);
//        fj.setDtCjsj(new Date());
//        fjlist.add(fj);
//    }
//    @Override
//    public MultipartFile getMultipartFileByFile(File file) throws IOException {
//        /**需要pom导入mock依赖*/
//        InputStream inputStream = new FileInputStream(file);
//        MultipartFile multipartFile = new MockMultipartFile(file.getName(), inputStream);
//        return multipartFile;
//    }
//    @Override
//    public void insertFjs(List<YJ_Fj> fjs) {
//        fjMapperExt.insertBatch(fjs);
//    }
//}
