package src._04string._4stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuilder str = new StringBuilder("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        str.append("imooc");
        System.out.println(str);
        //使用delete方法删除"欢迎来到",然后插入“hello！”
        str.delete(0, 4).insert(0, "hello!");
        System.out.println("删除插入后："+str);
        //将字符串变成“hello，imooc” 使用replace方法替换
        str.replace(5, 6,",");
        System.out.println("replace后:"+str);
    }
}
