// This program creates Employee objects, tests their methods, and prints the results.

import MyEmployees.Employee; // Import the Employee class from the MyEmployees package

public class EmployeeMainTest { // Main class containing the entry point of the program

    public static void main(String[] args) {
        // Step 1: Create the first Employee object using the full constructor
        Employee employee1 = new Employee(361361, "Rodrigue", "Gaetan",
                35, "gaetanrodrigue98@gmail.com", "Engineering", 250458.25);

        // Step 2: Create the second Employee object with different data
        Employee employee2 = new Employee(361361, "Bro", "Book",
                26, "gaetanrodrigue98@gmail.com", "Engineering", 75268.152);

        // Step 3: Create the third Employee object by copying employee2 using the copy constructor
        Employee employee3 = new Employee(employee2);

        // Step 4: Print the details of employee1, employee2, and employee3
        System.out.println(employee1 + "\n");
        System.out.println(employee2 + "\n");
        System.out.println(employee3 + "\n");

        // Step 5: Compare employee1 and employee2 using the equals() method
        // Print true if they are considered equal, false otherwise
        System.out.println(employee1.equals(employee2));

        // Step 6: Calculate and print the annual salary of each employee
        System.out.println(employee1.getFirstName() + " Annual Salary is " + employee1.calculateAnnualSalary());
        System.out.println(employee2.getFirstName() + " Annual Salary is " + employee2.calculateAnnualSalary());
        System.out.println(employee3.getFirstName() + " Annual Salary is " + employee3.calculateAnnualSalary());

        // Step 7: Give a 10% raise to employee2
        employee2.giveARaise(10.0);

        // Step 8: Print employee2's new annual salary after the raise
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " New Annual Salary is " + employee2.calculateAnnualSalary());
    }
}
