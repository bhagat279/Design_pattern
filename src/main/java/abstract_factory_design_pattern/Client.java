package abstract_factory_design_pattern;

public class Client {
    public static void main(String[] args) {

        // get java developer

        Employee employee = EmployeeFactory.getEmployee(new JavaDevFactory());
        System.out.println(employee.name());


        Employee employee1 = EmployeeFactory.getEmployee(new PythonDevFactory());
        System.out.println(employee1.name());

        Employee employee2 = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(employee2.name());
    }
}
