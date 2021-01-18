package advanced._05lambda.demo1;

/**
 * 四则运算接口
 */
@FunctionalInterface //该注解可省略,加上后,会在编译时进行检查,否则运行时才报错.作用是通知编译器这是函数式接口,进行抽象方法检查
public interface MathOperation {
    public Float operate(Integer a ,Integer b);
}
