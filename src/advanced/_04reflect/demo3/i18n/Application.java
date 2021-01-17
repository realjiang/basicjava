package advanced._04reflect.demo3.i18n;

import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * 反射在项目中的应用
 * config.properties配置文件
 */
public class Application {
    public static void say(){
        Properties properties = new Properties();
        String configPath = Application.class.getResource("/config.properties").getPath();
        try {
            configPath = new URLDecoder().decode(configPath,"UTF-8");
            properties.load(new FileInputStream(configPath));
            //获取属性值。参数：配置文件中的属性名
            String language = properties.getProperty("language");
            I18N i18n = (I18N)Class.forName(language).newInstance();
            System.out.println(i18n.say());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.say();
    }
}
