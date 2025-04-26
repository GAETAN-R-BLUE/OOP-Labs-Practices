package MyEmployees; // Package name

// Employee class to model an employee's information
public class Employee {
    // Properties (fields) of the Employee class
    private int employeeID; // Unique identifier for employee
    private String firstName; // Employee's first name
    private Integer age;
    private String lastName; // Employee's last name
    private String email; // Employee's email address
    private String department; // Department employee belongs to
    private double salary; // Employee's salary

    // Constructor to initialize Employee object without salary
    public Employee(int employeeID, String firstName, String lastName,Integer age, String email, String department, Double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
    // Getter for age
    public int  getAge() {
        return age;
    }

    // Setter for salary
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter methods for other fields
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString() method to display employee information nicely
    @Override
    public String toString() {
        return "Employee Details:\n" +
                "ID: " + employeeID + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Department: " + department + "\n" +
                "Salary: " + salary;
    }
}