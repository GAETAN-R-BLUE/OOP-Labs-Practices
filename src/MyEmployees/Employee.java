package MyEmployees; // Package name

// Employee class to model an employee's information
public class Employee {
    // Properties (fields) of the Employee class
    private int employeeID; // Unique identifier for employee
    private String firstName; // Employee's first name
    private int age;
    private String lastName; // Employee's last name
    private String email; // Employee's email address
    private String department; // Department employee belongs to
    private double salary; // Employee's salary

    //The following is the default constructor
    public Employee() {
        this.employeeID = 0;
        this.department = "Unknown";
        this.age = 18;
        this.salary = 0.0;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.email = "Unknown";
    }

    // Constructor to initialize Employee object
    public Employee(int employeeID, String firstName, String lastName,int age, String email, String department, double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
    // Constructor to initialize Employee object
    public Employee(int employeeID, String firstName, String lastName,Integer age, String email) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;

    }
    // Constructor to initialize Employee object with first name, last name and salary
    public Employee(String firstName, String lastName,double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
    public Employee(String firstName, String lastName, Integer age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.salary = salary;
    }
    public Employee(Employee x) {
        this.firstName = x.firstName;
        this.lastName = x.lastName;
        this.age = x.age;
        this.salary = x.salary;
        this.employeeID = x.employeeID;
        this.department = x.department;
        this.email = x.email;
    }
    // Getter for age
    public int  getAge() {
        return age;
    }

    // Setter for salary
    public void setAge(int age) {
        if (age < 18 && age > 65) {
            System.out.println("The Employee must be between 18 and 65 Years old");
        }
        else {
            this.age = age;
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("The salary should be a positive number");
        }
        else {  this.salary = salary;
        }
    }

    // Getter for EmployeeID
    public int getEmployeeID() {
        return employeeID;
    }
    //Setter for employee ID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    //Getter for employee First Name
    public String getFirstName() {
        return firstName;
    }
    //Setter for employee First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //Getter for employee Last Name
    public String getLastName() {
        return lastName;
    }
    //Setter for employee Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Getter for employee Email
    public String getEmail() {
        return email;
    }
    //Setter for employee Email
    public void setEmail(String email) {
        this.email = email;
    }
    //Getter for employee Department
    public String getDepartment() {
        return department;
    }
    //Setter for employee Department
    public void setDepartment(String department) {
        this.department = department;
    }
    // Method to calculate the annual salary
    public double calculateAnnualSalary(){
        return salary*12;
    }
    // This method determine the raise to give an employee
    public  void  giveARaise(double percentage){
        if (percentage < 0){
            System.out.println("The percentage should be more than 0");
        }
        else{
            double raise = ((salary * percentage) /100);
            this.salary += raise;
            System.out.println(this.firstName + " " + this.lastName + " received a raise of  " + raise);
        }
    }

    // toString() method to display employee information nicely

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // if same memory address
        if (obj == null || getClass() != obj.getClass()) return false; // null or not same class

        Employee employee = (Employee) obj; // cast

        return employeeID == employee.employeeID &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                email.equals(employee.email) &&
                department.equals(employee.department);
    }


    public String toString() {
        return "\n====Employee Details:=====\n" +
                "ID: " + employeeID + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Email: " + email + "\n" +
                "Department: " + department + "\n" +
                "Salary: $" + salary;
    }
}