package org.example.singleton_design_pattern;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {

    private static Employee employee;

    //Constructor
    private Employee()
    {
       if(employee!=null)
      {
        throw new RuntimeException("you are trying to break singleton pattern, beacuse object is already inialized");
      }
    }

     // lazy way of creating singleton object
   /* public static Employee getEmployee()
    {
        // object of this class
        if(employee==null)
        {
             employee = new Employee();
        }
        //employee=new Employee();// it will give different hashcode value
        return employee;
    }*/

    //lazy way of creating singleton object
    // for thread safety
    public static Employee getEmployee()
    {
        // object of this class
          if(employee==null)
          {
            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee();
                }
            }
        }
        //employee=new Employee();// it will give different hashcode value
        return employee;
    }

    public Object readResolve()
    {
      return employee;
    }

   /* @Override
    public Object clone() throws CloneNotSupportedException
    {
      //  return super.clone();
        return employee;
    }*/
}
/*
// For singleton design pattern
===>singleton design pattern: It is use to create object. If we want to create only 1 object in whole project and also want
    to re-use then we should use singleton design pattern.

1. Constructor should private
2. Object create with help of method()
3. create private field to store object

--------------------------
===>Reflection Api to break singleton pattern
   using Reflection API, we can dynamically fetch/access any class/interface property and modify

------------------------Durga----------
Singleton-class : For any java class, If we are allow to create only 1 Object , such type of class is call singleton class.
                 Ex: RunTime, BusinessDeligate, ServiceLocator

Advantage of Singleton-class: If several people have same Requirement then it is not recommended to create a separate
                             object for every requirement.
                             We have to create only 1 object and we can re-use the same object for evry similar requirement
                             So that performance and memory utilization will be improved. This is the central idea of singleton
                             classes.



 */