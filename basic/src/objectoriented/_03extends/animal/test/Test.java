package objectoriented._03extends.animal.test;

import objectoriented._03extends.animal.info.Cat;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:58
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("花花");
        cat.setSpecies("田园猫");
        cat.run();
    }
}
