package practice;

import builder_geekfic.Director;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Employee e1 = Employee.getEmployee();
        System.out.println(e1.hashCode());

       Constructor<Employee> constructor = Employee.class.getDeclaredConstructor();
       constructor.setAccessible(true);
        Employee e2 = constructor.newInstance();
        System.out.println(e2.hashCode());

    }
}
