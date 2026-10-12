package practice;

public class Employee {
   private static Employee employee;

   private Employee()
   {
         if(employee!=null)
         {
             throw new RuntimeException("khali naikhe bani ham");
         }
   }

   public static Employee getEmployee()
   {
       if(employee ==null) {
           synchronized (Employee.class) {
               if (employee == null) {
                   employee = new Employee();
               }
           }

       }
       return employee;
   }
}
