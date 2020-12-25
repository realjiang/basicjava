package src._06generics._3demo2;

public class NumGeneric<T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
//测试
    public static void main(String[] args) {
        //使用泛型类
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println(intNum.getNum());
        NumGeneric<Double> doubleNum = new NumGeneric<>();
        doubleNum.setNum(10.0);
        System.out.println(doubleNum.getNum());
        NumGeneric<Float> floatNum = new NumGeneric<>();
        floatNum.setNum(10f);
        System.out.println(floatNum.getNum());
    }
}
