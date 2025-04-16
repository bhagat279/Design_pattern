package abstract_factory_design_pattern;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 8000000;
    }

    @Override
    public String name() {
        System.out.println("manager");
        return "bhanvi";
    }
}
