package factory_design_pattern;

public class PythonDeveloper implements Employee{
    @Override
    public int getSalury() {
        System.out.println("PythonDeveloper salury");
        return 10000;
    }
}
