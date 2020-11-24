package io;

import utils.IdUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 标题: 获取本地文件,上传至minio,并将附件信息存入库中
 *
 * @Author: Jiang
 * @Date: 2020/11/24 14:49
 */
public class UploadFromDisk {
    public  static void main(String[] args) throws IOException
    {

        File dir = new File("E:\\新建文件夹");//文件所在本地目录
        ArrayList<File> list = new ArrayList<File>(); //文件list

        //得到装入文件的集合
        Method_list(dir,list);
        System.out.println("文件个数:"+list.size());
        System.out.println("===============================");

        ArrayList<Fj> fjlist = new ArrayList<>(); //附件list
        for (File file: list) {
            String filename = file.getName(); // pzwh-n
            String pzwh = filename.substring(0, filename.indexOf("-"));
            System.out.println("批准文号:"+pzwh);
            //1.查询该批准文号对应的主键bh (同一个批准文号只有一条数据吗)
//            String bh = "";
//            bh = mapper.getbh(pzwh);
//            if (StringUtils.isNotBlank(bh)) {
                //2.如果查到对应bh,查询bh在附件表的ywbh是否有,返回个数
                int numOfYwbh = 0;
                //            numOfYwbh = Mapper.getYwbhNum(bh);
                //   1)有,且有5个及以上 break;
                if (numOfYwbh >= 5) {
                    break;
                } else {
                    //   2)否则,上传该图片,获取附件信息
                    uploadtominio(file,fjlist);
                }
//            }
        }
        /** 附件信息批量入库*/
//        insertFjInfo(fjlist);
        System.out.println("===============================");
        for (Fj fj:fjlist) {
            System.out.println(fj.getBH());
            System.out.println(fj.getYWB_BH());
        }
        //图片名称:批准文号-n
        //txt文件-存用途,用逗号拼接;文件名:批准文号
        //1.循环所有图片,获取名称,取-前字符串即为批准文号   同一个药品批准文号是否唯一?
        //  根据批准文号去药品基本信息表查对应的主键bh,再用这个主键去附件表的业务id查是否有
        //  如果有,就判断个数,个数等于5个后面的不再传
        //  如果没有或个数小于5个即再附件表新增一条记录,将药品表主键bh存入,类别存入  YP_TP
        //  将图片上传至minio,获得返回的路径,名称,后缀, 创建时间 存入
        //2.用途,  批准文号 -  用途 (汉字,用逗号拼接 或 码值用逗号拼接) 读取汉字,转为码值拼起来
    }

    private static void Method_list(File dir,ArrayList<File> list) {
        //便利出所有文件和文件夹的名字 返回的是数组
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++)
        {
            //判断不是隐藏文件 并且是一个文件夹
            if(!files[i].isHidden() && files[i].isDirectory())
            {
                // 如果是文件夹就在此调用这个方法找下一级的文件夹
                Method_list(files[i],list);
            }else
            {
                //如果不是文件夹是文件 就把后缀名是.TXT的文件写入集合中
                if(files[i].getName().endsWith(".jpg"))
                {
                    list.add(files[i]);
                }

            }
        }
    }

    public static void  uploadtominio(File file ,ArrayList<Fj> fjlist) {
        Fj fj = new Fj();
        fj.setBH(IdUtil.getUUID32());
        fj.setYWB_BH("批准文号对应的药品表主键bh");
        //保存图片名称和后缀
            /*String filename = file.getOriginalFilename();
            if (filename.contains("\\")) {
                filename = filename.substring(filename.lastIndexOf("\\")+1);
            }
            fileVo.setCMc(filename);
            if (filename.lastIndexOf(".") > 0) {
                fileVo.setCHz(filename.substring(filename.lastIndexOf(".")));
            }*/
        //上传该图片file至minio 得到路径并保存
           /*String protocol = tcsService.uploadByGeneratePath(ITcsService.DEFAULT_CORP, file.getInputStream(), filename);
            fileVo.setCLj(protocol);*/
        fjlist.add(fj);
    }
}
