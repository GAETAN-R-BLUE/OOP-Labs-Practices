// Package declaration - groups related classes together under 'MyEmployees'
package MyEmployees;

// Importing necessary Java classes
import java.util.ArrayList; // To store employees in a dynamic list
import java.util.Scanner;   // To get user input

// Main class definition
public class EmployeeManagementApp {

    // Main method - starting point of the program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner userInput = new Scanner(System.in);

        // Create an ArrayList to hold Employee objects
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Infinite loop to keep showing the menu until the user chooses to exit
        while (true) {
            // Displaying menu options to the user
            System.out.println("\n==== Employee Management System ====" + "\n \n" +
                    "1. Add New Employee \n" +
                    "2. View All Employee \n" +
                    "3. Update Employee Salary \n" +
                    "4. Give a raise to Employee \n" +
                    "5. Delete Employee \n" +
                    "6. Exit");

            // Read user's choice
            int choice = userInput.nextInt();
            userInput.nextLine(); // Consume leftover newline

            // Switch-case to handle user's choice
            switch (choice) {

                // Case 1: Add new employee
                case 1: {
                    System.out.println("Enter the employee first name:");
                    String firstName = userInput.nextLine();

                    System.out.println("Enter the employee last name:");
                    String lastName = userInput.nextLine();

                    System.out.println("Enter the employee age:");
                    int age = userInput.nextInt();
                    userInput.nextLine(); // Consume leftover newline

                    System.out.println("Enter the employee email:");
                    String email = userInput.nextLine();

                    System.out.println("Enter the employee ID:");
                    int ID = userInput.nextInt();
                    userInput.nextLine(); // Consume leftover newline

                    System.out.println("Enter the employee salary:");
                    double salary = userInput.nextDouble();
                    userInput.nextLine(); // Consume leftover newline

                    System.out.println("Enter the employee department:");
                    String department = userInput.nextLine();

                    // Create a new Employee object using input data
                    Employee newEmployee = new Employee(ID, firstName, lastName, age, email, department, salary);

                    // Add the new employee to the list
                    employeeList.add(newEmployee);
                    break;
                }

                // Case 2: View all employees
                case 2: {
                    System.out.println("===*** Employee List ***===\n");

                    // Loop through all employees and print their details
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println(employeeList.get(i));
                    }
                    break;
                }

                // Case 3: Update an employee's salary
                case 3: {
                    boolean employeeFound = false;

                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine(); // Consume leftover newline

                    // Find the employee by ID
                    for (Employee employee : employeeList) {
                        if (employee.getEmployeeID() == idToUpdate) {
                            System.out.println("Enter the new salary:");
                            double newSalary = userInput.nextDouble();
                            employee.setSalary(newSalary); // Update salary
                            System.out.println("Salary updated successfully");
                            employeeFound = true;
                            break;
                        }
                    }

                    // If employee not found, show a message
                    if (!employeeFound) {
                        System.out.println("Employee not found");
                    }
                    break;
                }

                // Case 4: Give a raise to an employee
                case 4: {
                    boolean employeeFound = false;

                    System.out.println("*=====* Give A Raise *=====*");
                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine(); // Consume leftover newline

                    // Find the employee by ID
                    for (Employee employee : employeeList) {
                        if (employee.getEmployeeID() == idToUpdate) {
                            System.out.println("Enter the percentage:");
                            double percentage = userInput.nextDouble();
                            employee.giveARaise(percentage); // Apply raise
                            System.out.println("New Salary updated successfully");
                            employeeFound = true;
                            break;
                        }
                    }

                    // If employee not found, show a message
                    if (!employeeFound) {
                        System.out.println("Employee not found");
                    }
                    break;
                }

                // Case 5: Delete an employee
                case 5: {
                    System.out.println("===** Delete Employee **===");
                    boolean employeeFound = false;

                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine(); // Consume leftover newline

                    // Find and remove the employee by ID
                    for (Employee employee : employeeList) {
                        if (employee.getEmployeeID() == idToUpdate) {
                            employeeList.remove(employee);
                            employeeFound = true;
                            break;
                        }
                    }

                    // If employee not found, show a message
                    if (!employeeFound) {
                        System.out.println("Employee not found");
                    }
                    break;
                }

                // Case 6: Exit the program
                case 6: {
                    return; // Exits the main method, hence ending the program
                }
            }
        }
    }
}