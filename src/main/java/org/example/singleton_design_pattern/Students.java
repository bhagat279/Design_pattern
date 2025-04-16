package org.example.singleton_design_pattern;

public class Students {

    //Eager way of creating singleton object
    private static Students students=new Students();

    public static Students getStudents()
    {
        return students;
    }

}
/*
===>Using static, at class load time object will create automatically, here its does not matter client requires object or not,
    Object will create ny default due to line num: 6



 */