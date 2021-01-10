package basic.utils.trans;

/**
 * 标题: string转Boolean
 *
 * @Author: Jiang
 * @Date: 2020/12/10 9:41
 */
public class StringToBooleanUtil {
    public static void main(String[] args) {
        /**
         * 方式一:
         */
        Boolean.parseBoolean("true");
        /**
         * 方式二:
         */
        String  ss = "true";
        boolean b = Boolean.valueOf(ss).booleanValue();
    }
}
