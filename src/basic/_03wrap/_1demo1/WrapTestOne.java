package basic._03wrap._1demo1;

/**
 * 标题: 包装类-装箱&拆箱
 *
 * @Author: Jiang
 * @Date: 2020/12/21 17:56
 */
public class WrapTestOne {
    public static void main(String[] args) {
        // 包装类:解决java基本数据类型不具有对象化能力的问题,所有包装类都存放在,java.lang这个包内
        /**装箱:把基本数据类型转换为包装类*/
        //1.自动装箱
        int t1 = 2;
        Integer t2 = t1;
        //2.手动装箱
        //方式一:
        Integer t3 = new Integer(t1);
        //方式二:
        Integer t33 = Integer.valueOf(t1);
        //测试
        System.out.println("int类型变量t1="+t1);
        System.out.println("Integer类型变量t2="+t2);
        System.out.println("Integer类型变量t3="+t3);
        System.out.println("Integer类型变量t33="+t33);
        System.out.println("=========================================");
        /**拆箱:把包装类转换为基本数据类型*/
        //1.自动拆箱
        int t4 = t2;
        //2.手动拆箱
        int t5 = t2.intValue();
        //测试
        System.out.println("Integer类型变量t2="+t2);
        System.out.println("int类型变量t4="+t4);
        System.out.println("int类型变量t5="+t5);
        double t6 = t2.doubleValue();
        System.out.println("手动拆箱后,double类型变量t6="+t6);
    }
}
