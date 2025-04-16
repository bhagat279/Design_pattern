package fact;

public class FactoryEmp {

    public static Emp getEmp(String emp)
    {
        if(emp.equals("java"))
        {
            return new JavaDev();
        }
        else if(emp.equals("pyth"))
        {
            return new PythDev();
        }
        else {
            return null;
        }
    }
}
