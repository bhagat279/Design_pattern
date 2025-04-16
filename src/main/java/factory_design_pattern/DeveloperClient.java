package factory_design_pattern;

public class DeveloperClient {
    public static void main(String[] args) {
//        Employee employee = new JavaDeveloper();
//        System.out.println(employee.getSalury());

        Employee emp = EmployeeFactory.getEmployee("Java Developer");
        System.out.println(emp.getSalury());

        Employee emp2 = EmployeeFactory.getEmployee("Python Developer");
        System.out.println(emp2.getSalury());

//        Employee emp3 = EmployeeFactory.getEmployee("rgfg");
//        System.out.println(emp3.getSalury());

    }
}
