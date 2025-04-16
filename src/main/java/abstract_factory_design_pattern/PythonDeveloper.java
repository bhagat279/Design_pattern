package abstract_factory_design_pattern;

public class PythonDeveloper implements Employee{
    @Override
    public int salary() {
        return 500000;
    }

    @Override
    public String name() {
        System.out.println("Python developer");
        return "anish";
    }
}
