// This program creates two Employee objects with identical properties,
// and then checks if they are considered equal using the equals() method.

import MyEmployees.Employee; // Import the Employee class from the MyEmployees package

public class EmployeeMain { // Main class containing the entry point of the program

    public static void main(String[] args) {
        // Create the first Employee object
        Employee employee = new Employee(361361, "Rodrigue", "Gaetan",
                "gaetanrodrigue98@gmail.com", "Engineering");

        // Create the second Employee object with the same data
        Employee employ = new Employee(361361, "Rodrigue", "Gaetan",
                "gaetanrodrigue98@gmail.com", "Engineering");

        // Compare the two Employee objects using the equals() method
        // and print the result (true or false)
        System.out.println(employee.equals(employ));
    }
}
