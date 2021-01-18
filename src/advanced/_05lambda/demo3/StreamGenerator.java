package advanced._05lambda.demo3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream流式处理:
 * Stream流对象的五种创建方式
 * 需引入hamcrest-core-1.3.jar和junit-4.12.jar这两个包,做测试
 */
public class StreamGenerator {
    //1.基于数组进行创建(常用)
    @Test
    public void generator1(){
        String[] arr = {"Lily" , "Andy" , "Jackson" , "Smith"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(s->System.out.println(s));//底层是Consumer接口,一个参数,无返回值,s的类型和stream对象的类型一致
    }

    //2.基于集合进行创建(常用)
    @Test
    public void generator2(){
        List<String> list = new ArrayList<>();
        list.add("Lily");
        list.add("Andy");
        list.add("Jackson");
        list.add("Smith");
        Stream<String> stream = list.stream();
        stream.forEach(s->System.out.println(s));
    }

    //3.利用generate方法创建无限长度流
    @Test
    public void generator3(){
        //创建随机整数序列
        Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(100000));//底层是Sipplier函数式接口,创建新的对象时使用.不需要输入参数.
        stream.limit(10).forEach(i->System.out.println(i));//不写limit时,运行时会产生无穷无尽的100000内整数.使用limit可以设置需要的长度.
    }

    //4.基于迭代器创建流
    @Test
    public void generator4(){
        //创建从1到100的自增序列
        Stream<Integer> stream = Stream.iterate(1,n->n+1);//参数一:起始值,参数二:步长,底层是UnaryOperator接口
        stream.limit(100).forEach(i->System.out.println(i));
    }
    //5.基于字符序列创建流(可应用于编写底层框架时)
    @Test
    public void generator5(){
        String str = "abcdefg我的";
        IntStream stream = str.chars();//字符数组
        stream.forEach(c -> System.out.println((char)c));//c是字符的ascii码/Unicode码,需要强制转换为char类型
    }
}
