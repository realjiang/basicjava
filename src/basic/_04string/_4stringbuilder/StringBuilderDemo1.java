package basic._04string._4stringbuilder;

public class StringBuilderDemo1 {
    /**
     * StringBuilder 继承至java.lang.Object
     */
    public static void main(String[] args) {
        /**不具备不可变性*/
        StringBuilder sb = new StringBuilder("abc");
        sb.append("de");
        System.out.println(sb);// abcde
        /**构造方法*/
        //StringBuilder();//在内存中开辟一块能容纳16个字符的内存空间
        //StringBuilder(CharSequence seq);//CharSequence类似String类的使用
        //StringBuilder(int capacity);//指定容量
        //StringBuilder(String str);//常用的构造方法
        /**成员方法*/
        //apend(XXX);//在字符串后增加内容，支持多种类型
        //charAt(index);//取某个位置的字符，同String
        //indexOf(XXX);//同String
        //delete();//删除某字符
        //insert();//指定位置插入内容
        //length();//求字符串长度
        //replace();//替换
        //subString();//截取字符串
        //toString();//StringBuilder转换为String类型
        System.out.println("****************************");
        /**test*/
        StringBuilder sb1 = new StringBuilder("你好");
        sb1.append(',');
        sb1.append("imooc!");
//        sb1.append(',').append("imooc!");//这么写比较简便
        System.out.println("sb1="+sb1);
        System.out.println("------------------");
        //将字符串变成"你好,iMOOC！"
        //两种方式：
        //1。使用delete方法删除mooc，然后再insert插入MOOC（其中offset大于等于0，从第offset个字符后开始插入新内容）
        System.out.println("替换后："+sb1.delete(4,8).insert(4,"MOOC"));
        //2。使用replace方法直接替换
        System.out.println("替换后："+sb1.replace(4,8,"MOOC"));
        System.out.println("------------------");
        //在字符串中取出"你好"并输出
        System.out.println("替换后："+sb1.substring(0,2));
    }
}
