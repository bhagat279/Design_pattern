package org.example.singleton_design_pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception
    {
        System.out.println("this is main client");

      /*  Employee employee1 = Employee.getEmployee();

        System.out.println(employee1.hashCode());

        Employee employee2= Employee.getEmployee();

        System.out.println(employee2.hashCode());*/


      // calling Student object(eager way of creating singleton object)
       /* System.out.println(Students.getStudents().hashCode());

        System.out.println(Students.getStudents().hashCode());*/
// ---------------------------------------------------------------------------

        //Breaking singleton pattern using reflection API
       /* Employee employee1 = Employee.getEmployee();

        System.out.println(employee1.hashCode());

        Constructor<Employee> declaredConstructor = Employee.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Employee e1 = declaredConstructor.newInstance();
        System.out.println(e1.hashCode());*/
        //-------------------------------------------------------------------------------------------
        //using Enum to save from Reflection API

        /*EnumClass apple = EnumClass.APPLE;
        System.out.println(apple.hashCode()+":"+apple);

        apple.test();*/

//        Constructor<EnumClass> declaredConstructor = EnumClass.class.getDeclaredConstructor();
//         declaredConstructor.setAccessible(true);
//         EnumClass employee2 = declaredConstructor.newInstance();
//         System.out.println(employee2.hashCode());

       /* Employee employee1 = Employee.getEmployee();
        System.out.println(employee1.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.xd"));
        oos.writeObject(employee1);

        System.out.println("serilization done");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.xd"));
        Employee employee2 = (Employee) ois.readObject();
        System.out.println(employee2.hashCode());*/

       /* Employee clone = (Employee) employee1.clone();

        System.out.println(clone.hashCode());*/


    }
}
/*
===>Reflection Api to break singleton pattern
   using Reflection API, we can dynamically fetch/access any class/interface property and modify

    : Solution-1:if object is there ===>throw exception inside the constructor
    : Solution-2: Use Enum

===> Deserialization to break singleton pattern
    : Solution-1==> Implementing readResolve() method

===> Cloning to break singleton pattern

 */