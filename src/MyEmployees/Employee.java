package MyEmployees;

public class Employee {
    // The following are the properties of the employee class
    private int  employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    // The following is the constructor of my class
    public Employee (int employeeID, String firstName, String lastName, String email, String department  ){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    // The following are the setter and the getter for my employee class

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
    @Override
    public String toString() {
        return "Employee Details:\n" +
                "ID: " + employeeID + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Department: " + department;
    }
}

