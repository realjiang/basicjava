//package io.demo1;
//
//import com.thunisoft.ygyd.common.entity.po.yj.YJ_Fj;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 标题: 批量上传service
// *
// * @Author: Jiang
// * @Date: 2020/11/25 14:30
// */
//public interface UploadFromDiskService {
//
//    /**
//     * 从本地批量导入图片
//     * @throws IOException
//     */
//    void uploadImg() throws IOException;
//
//    /**
//     * 获取文件集合
//     * @param dir 目录
//     * @param list 文件集合
//     */
//    void getFileList(File dir,ArrayList<File> list);
//    /**
//     * 根据批准文号和包装规格获得药品信息
//     * @param pzwh 批准文号
//     * @param bzgg 包装规格
//     * @return 药品info
//     */
//    String getYpbhByPzwhAndBzgg(String pzwh, String bzgg);
//    /**
//     * 根据业务编号和业务类别查询记录条数
//     * @param ypbh 业务编号
//     * @return 条数
//     */
//    int getNumOfYwbhAndYwlb(String ypbh);
//    /**
//     *  上传文件至minio,并得到路径等附件信息
//     * @param file 文件
//     * @param fjlist 附件信息集合
//     * @param fj 附件
//     * @throws IOException
//     */
//    void uploadToMinio(File file ,ArrayList<YJ_Fj> fjlist ,YJ_Fj fj) throws IOException;
//    /**
//     * 将File转为MultipartFile
//     * @param file file
//     * @return MultipartFile
//     * @throws IOException
//     */
//    MultipartFile getMultipartFileByFile(File file) throws IOException;
//    /**
//     * 将附件信息批量入库
//     * @param fjs 附件信息
//     */
//    void insertFjs(List<YJ_Fj> fjs);
//}
