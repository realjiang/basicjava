package src._06generics._3demo2;

public class TwoNumGeneric<T,X> {
    private T num1;
    private X num2;

    public void getNum(T num1,X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }
//测试
    public static void main(String[] args) {
        TwoNumGeneric<Integer,Float> numObj = new TwoNumGeneric<>();
        numObj.getNum(25,0.5f);
        System.out.println(numObj.getNum1());
        System.out.println(numObj.getNum2());
    }
}
