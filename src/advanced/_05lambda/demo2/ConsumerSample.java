package advanced._05lambda.demo2;

import java.util.function.Consumer;

/**
 * Consumer接口的使用
 * 所在包: java.util.function
 * 用于只有一个参数且没有任何数据返回的情况
 * 有且只有一个方法accept,执行accept后,调用->后的代码
 */
public class ConsumerSample {
    public static void main(String[] args) {
        output(s-> System.out.println("向控制台打印:" + s));
        output(s->{
            System.out.println("向XXX网站发送数据包:" + s);
        });
    }
    public static void output(Consumer<String> consumer){
        String text = "天将降大任于是人也，必先苦其心志，劳其筋骨，饿其体肤，空乏其身，行拂乱其所为。";
        consumer.accept(text);
    }
}
