package basic._08io.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 标题: 获取本地文件
 *
 * @Author: Jiang
 * @Date: 2020/11/24 14:49
 */
public class UploadFromDiskMain {

    public static final int MAXIMUM_NUMBER_OF_PICTURES_FOR_ONE_DRUG = 5;

    public  static void main(String[] args) throws IOException {
        File dir = new File("E:\\新建文件夹");//文件所在本地目录
        ArrayList<File> list = new ArrayList<>(); //文件list
        /**获取文件集合*/
        getFileList(dir,list);
        /*ArrayList<Fj> fjlist = new ArrayList<>(); //附件list
        for (File file: list) {
            String filename = file.getName(); // pzwh+bzgg-n.jpg
            String hz = filename.substring(filename.lastIndexOf(".")+1);
            filename = filename.replace("=","/")
                    .replace("@","*")
                    .replace("#",":");
            String pzwh = filename.substring(0, filename.indexOf("+"));
            String bzgg = filename.substring(filename.indexOf("+")+1, filename.indexOf("-"));
            //上传图片至minio,获取路径
            Fj fj = new Fj();
            uploadToMinio(file,fjlist,fj);
        }*/
    }

    /**
     * 获取文件集合
     * @param dir 目录
     * @param list 文件集合
     */
    private static void getFileList(File dir,ArrayList<File> list) {
        //遍历出所有文件和文件夹的名字 返回的是数组
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            //判断不是隐藏文件 并且是一个文件夹
            if(!files[i].isHidden() && files[i].isDirectory()) {
                // 如果是文件夹就在此调用这个方法找下一级的文件夹
                getFileList(files[i],list);
            }else {
                //如果不是文件夹是文件 就把后缀名是.TXT的文件写入集合中
                if(files[i].getName().endsWith(".jpg") || files[i].getName().endsWith(".png")) {
                    list.add(files[i]);
                }

            }
        }
    }

    /*public static void uploadToMinio(File file ,ArrayList<Fj> fjlist,Fj fj) throws IOException {
        MultipartFile mfile = getMultipartFileByFile(file);
        fj.setcBh(IdUtil.getUUID32());
        //需要pom导入tcs依赖
        String protocol = tcsService.uploadByGeneratePath(ITcsService.DEFAULT_CORP, mfile.getInputStream(), fj.getcMc());
        fj.setcLj(protocol);
        fj.setDtCjsj(new Date());
        fjlist.add(fj);
    }*/

    /*public static MultipartFile getMultipartFileByFile(File file) throws IOException {
        //需要pom导入mock依赖
        InputStream inputStream = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile(file.getName(), inputStream);
        return multipartFile;
    }*/
}
