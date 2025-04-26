// This program creates two Employee objects with identical properties,
// and then checks if they are considered equal using the equals() method.

import MyEmployees.Employee; // Import the Employee class from the MyEmployees package

public class EmployeeMain { // Main class containing the entry point of the program

    public static void main(String[] args) {
        // Create the first Employee object
        Employee employee1 = new Employee(361361, "Rodrigue", "Gaetan",
                35,"gaetanrodrigue98@gmail.com", "Engineering", 250458.25);

        // Create the second Employee object with the same data
        Employee employee2 = new Employee(361361, "Rodrigue", "Gaetan",
                26,"gaetanrodrigue98@gmail.com", "Engineering",75268.152);

        // Compare the two Employee objects using the equals() method
        // and print the result (true or false)
        System.out.println(employee1.equals(employee2));
    }
}
