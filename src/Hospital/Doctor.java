package Hospital;

import MyEmployees.Employee;

public class Doctor extends Employee{

    private String Speciality;
    private String PhoneNumber;

    public Doctor(String speciality, String phoneNumber) {
        this.Speciality = speciality;
        this.PhoneNumber = phoneNumber;
    }

    public Doctor(int employeeID, String firstName, String lastName, int age, String email, String department, double salary, String speciality, String phoneNumber) {
        super(employeeID, firstName, lastName, age, email, department, salary);
        this.Speciality = speciality;
        this.PhoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
