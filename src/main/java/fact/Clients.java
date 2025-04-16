package fact;

public class Clients {

    public static void main(String[] args) {

        Emp emp = FactoryEmp.getEmp("pyth");
        emp.getEmpSal();
    }
}
