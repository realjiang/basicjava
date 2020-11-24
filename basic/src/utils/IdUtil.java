package utils;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * @desc ID工具类
 * @author
 * @since 2020-08-11
 */
public class IdUtil {

    private static final String SYMBOLS = "0123456789"; // 数字

    /**
     * 生成32位中英文混搭的ID串
     * @return
     */
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 生成6位手机验证码
     * @return
     */
    public static String createVerificationCode(){
        char[] nonceChars = new char[6];

        SecureRandom secureRandom = new SecureRandom();

        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(secureRandom.nextInt(SYMBOLS.length()));
        }
        return String.valueOf(nonceChars);
    }

    /**
     * 生成32位中英文混搭的ID串
     * @return
     *//*
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    *//**
     * 生成6位手机验证码
     * @return
     *//*
    public static String createVerificationCode(){
        return (int)((Math.random()*9+1)*100000) + "";
    }*/
}
