package basic._04string._3demo2;

/**
 * 标题: 字符串的不可变性
 *
 * @Author: Jiang
 * @Date: 2020/12/22 17:54
 */
public class StringDemo4 {
    public static void main(String[] args) {
        /**
         * String对象一旦被创建,则不能修改,是不可变的.
         * 所谓的修改其实是创建了新的对象,所指向的内存空间不变.
         * 通俗的说就是,变了,是因为指向了一个新的对象,而不是把原来对象的内容修改了~
         */
        String s1 = "jiang"; //常量池中生成一个字符串jiang,s1指向jiang
        //s1="hello,"+s1; //在常量池新生成了一个字符串hello,jiang,s1不再指向jiang所在内存空间,而是指向hello,jiang所在内存空间
        String s2 = "hello,"+s1;//在常量池新生成了一个字符串hello,jiang,s1仍指向jiang所在内存空间,而s2指向hello,jiang所在内存空间
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        String s3 = new String("hello,jiang");
        System.out.println("子串:"+s3.substring(0,5));//在常量池生成了hello字符串
        System.out.println("s3="+s3);//s3仍指向堆空间中的"hello,jiang"

    }
}
