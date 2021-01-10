package basic._06generics._2test1;

public class Dog extends Animal{
    /**
     * 方式二：通过构造器赋值
     * @param name 名字
     */
    public Dog(String name){
        this.setName(name);
    }

    @Override
    public void play() {
        System.out.println("小狗"+this.getName()+"在做游戏");
    }
}
