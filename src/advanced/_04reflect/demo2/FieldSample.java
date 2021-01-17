package advanced._04reflect.demo2;


import advanced._04reflect.demo2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 4。反射的核心类-Field类
 * 利用Field对成员变量赋值/取值
 */
public class FieldSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("advanced._04reflect.demo2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            //参数：成员变量名称
            Field enameField = employeeClass.getField("ename");
            //set方法参数：对象，对应成员变量的值
            enameField.set(employee,"李雷");
            //get方法参数：对象
            String ename = (String)enameField.get(employee);
            System.out.println("ename:" + ename);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            //没有找到对应成员变量时抛出的异常（访问私有成员变量时也抛出该异常）
            e.printStackTrace();
        }
    }
}
