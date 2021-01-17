package advanced._04reflect.demo2;


import advanced._04reflect.demo2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 3。反射的核心类-Method类
 * 利用Method方法类调用
 */
public class MethodSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("advanced._04reflect.demo2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee)constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            //参数：方法名，参数类型数组
            Method updateSalaryMethod = employeeClass.getMethod("updateSalary" , new Class[]{
                    Float.class
            });
            //invoke-用于执行方法。参数：对象，参数数值数组
            Employee employee1 = (Employee)updateSalaryMethod.invoke(employee,new Object[]{1000f});
            System.out.println(employee1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
