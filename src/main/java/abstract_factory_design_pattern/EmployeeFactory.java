package abstract_factory_design_pattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory)
    {
       return employeeAbstractFactory.createEmployee();
    }
}
