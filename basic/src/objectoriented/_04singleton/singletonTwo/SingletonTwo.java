package src.objectoriented._04singleton.singletonTwo;

/**
 * 懒汉式：类内实例对象创建时并不直接初始化，知道第一次调用get方法时，才会完成初始化操作.时间换空间，
 *          存在线程风险，解决方案：同步锁、双重校验锁、静态内部类、枚举。。。
 */
public class SingletonTwo {
    /**
     * 1、创建私有构造方法
     */
    private SingletonTwo() {

    }
    /**
     * 2、创建该类私有的静态实例对象
     */
    private static SingletonTwo instance = null;
    /**
     * 3、创建开放的静态方法提供实例对象
     * @return instance
     */
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
