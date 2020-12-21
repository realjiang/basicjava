package utils.trans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 标题: MultipartFile类型转换
 *
 * @Author: Jiang
 * @Date: 2020/11/28 14:40
 */
public class MultipartFileToFileUtil {
    /**
     * File类型转MultipartFile类型
     * @param file file文件
     * @return MultipartFile类型文件
     * @throws IOException
     */
    /*public MultipartFile getMultipartFileByFile(File file) throws IOException {
        //需要pom导入mock依赖
        InputStream inputStream = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile(file.getName(), inputStream);
        return multipartFile;
    }*/
    /** 例子:
     * <dependency>
     *   <groupId>org.springframework</groupId>
     *     <artifactId>spring-mock</artifactId>
     *     <version>2.0.8</version>
     *     <exclusions>
     *        <exclusion>
     *          <groupId>javax.servlet</groupId>
     *          <artifactId>servlet-api</artifactId>
     *        </exclusion>
     *     </exclusions>
     * </dependency>
     */
}
