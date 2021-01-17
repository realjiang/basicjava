package advanced._04reflect.demo2;


import advanced._04reflect.demo2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 2。反射的核心类-Constructor类
 * 利用带参构造方法创建对象
 */
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("advanced._04reflect.demo2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            //没有找到与之对应格式的方法,getConstructor抛出，例如：参数个数或类型不对
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            //当被调用的方法的内部抛出了异常而没有被捕获时。很少出现
            e.printStackTrace();
        }
    }
}
