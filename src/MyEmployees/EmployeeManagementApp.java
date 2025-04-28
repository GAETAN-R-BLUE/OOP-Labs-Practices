package MyEmployees;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList <Employee> employeeList = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Employee Management System ====" + "\n \n" +
                    "1. Add New Employee \n" +
                    "2. View All Employee \n" +
                    "3. Update Employee Salary \n" +
                    "4. Give a raise to Employee \n" +
                    "5. Delete Employee \n" +
                    "6. Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice){
                case 1 : {
                    System.out.println("Enter the employee first name:");
                    String firstName = userInput.nextLine();

                    System.out.println("Enter the employee last name:");
                    String lastName = userInput.nextLine();

                    System.out.println("Enter the employee age:");
                    int age = userInput.nextInt();
                    userInput.nextLine(); // Clear newline

                    System.out.println("Enter the employee email:");
                    String email = userInput.nextLine();

                    System.out.println("Enter the employee ID:");
                    int ID = userInput.nextInt();
                    userInput.nextLine(); // Clear newline

                    System.out.println("Enter the employee salary:");
                    double salary = userInput.nextDouble();
                    userInput.nextLine(); // Clear newline

                    System.out.println("Enter the employee department:");
                    String department = userInput.nextLine();
                    Employee newEmployee = new Employee(ID,firstName,lastName,age,email,department,salary);
                    employeeList.add(newEmployee);
                    break;
                }
                case 2 : {
                    System.out.println("===*** Employee List ***===\n");
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println(employeeList.get(i));
                    }
                    break;
                }
                case 3 : {
                    boolean employeeFound = false;
                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine();
                    for (Employee employee : employeeList){
                       if (employee.getEmployeeID() == idToUpdate){

                           System.out.println("enter the new salary:");
                           double newSalary = userInput.nextDouble();
                           employee.setSalary(newSalary);
                           System.out.println("Salary updated successfully");
                           employeeFound = true;
                           break;
                       }
                    }
                    if (!employeeFound){
                        System.out.println("Employee not found");
                    }
                    break;
                }
                case 4 : {
                    boolean employeeFound = false;
                    System.out.println("*=====* Give A Raise *=====*");
                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine();
                    for (Employee employee : employeeList){
                        if (employee.getEmployeeID() == idToUpdate) {

                            System.out.println("enter the percentage:");
                            double percentage = userInput.nextDouble();
                            employee.giveARaise(percentage);

                            System.out.println("new Salary updated successfully");
                            employeeFound = true;
                            break;
                        }
                    }
                    if (!employeeFound){
                        System.out.println("Employee not found");
                    }
                    break;
                }
                case 5 :{
                    System.out.println("===** Delete Employee **===");
                    boolean employeeFound = false;
                    System.out.println("Enter the employee ID");
                    int idToUpdate = userInput.nextInt();
                    userInput.nextLine();
                    for (Employee employee : employeeList){
                        if (employee.getEmployeeID() == idToUpdate){
                            employeeList.remove(employee.getEmployeeID());
                            employeeFound = true;
                            break;
                        }
                    }
                    if (!employeeFound){
                        System.out.println("Employee not found");
                    }
                    break;
                }
                case 6 :{
                    return;
                }
            }
        }
    }
}

