package advanced._04reflect.demo2;


import advanced._04reflect.demo2.entity.Employee;

/**
 * 1。反射的核心类-Class类
 */
public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到jvm,并返回对应Class对象
            Class employeeClass = Class.forName("advanced._04reflect.demo2.entity.Employee");
            System.out.println("Employee已被加载到jvm");
            //newInstance通过默认构造方法创建新的对象
            Employee emp = (Employee)employeeClass.newInstance();
            System.out.println(emp);
        } catch (ClassNotFoundException e) {
            //类名与类路径书写错误是抛出"类无法找到"异常
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //非法访问异常,当在作用域外访问对象方法或成员变量（例如，对象外访问对象的私有方法）时抛出
            e.printStackTrace();
        } catch (InstantiationException e) {
            //对象无法被实例化（如，抽象类不能实例化）,抛出"实例化异常"
            e.printStackTrace();
        }
    }
}
