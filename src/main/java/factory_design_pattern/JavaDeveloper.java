package factory_design_pattern;

import org.w3c.dom.ls.LSOutput;

public class JavaDeveloper implements Employee{

    @Override
    public int getSalury() {
        System.out.println("JavaDeveloper salury");
        return 5000;
    }
}
