import MyEmployees.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(361361, "Rodrigue", "Gaetan",
                "gaetanrodrigue98@gmail.com","Engineering") ;


        Employee employ = new Employee(361361, "Rodrigue", "Gaetan",
                "gaetanrodrigue98@gmail.com","Engineering") ;
        System.out.println(employee.equals(employ));


    }
}
