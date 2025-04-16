package abstract_factory_design_pattern;

public class JavaDeveloper implements Employee {


    @Override
    public int salary() {
        return 700000;
    }

    @Override
    public String name() {
        System.out.println("java developer");
        return "ravi";
    }
}
