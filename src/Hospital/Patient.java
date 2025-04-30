package Hospital;

import MyEmployees.Employee;

public class Patient {
    private int patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String doctor;
    private String illness;
    private String admissionDate;

    public Patient(){
        this.lastName = "unknown";
        this.firstName = "unknown";
        this.doctor = "unknown";
        this.patientID= 0;
        this.illness = "unknown";
        this.admissionDate = "unknown";
        this.age = 0;
    }
    public Patient(String lastName, String firstName, String Doctor, final int patientID, String illness, String admissionDate, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.doctor = Doctor;
        this.patientID= patientID;
        this.illness = illness;
        this.admissionDate = admissionDate;
        this.age = age;
    }

    public Patient(String lastName, String firstName, final int patientID, String illness, String admissionDate, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patientID= patientID;
        this.illness = illness;
        this.admissionDate = admissionDate;
        this.age = age;
    }
    public Patient(String lastName, String firstName, String illness, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.illness = illness;
        this.age = age;
    }
    public Patient(String lastName, String firstName, final int patientID){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patientID= patientID;
    }
    public Patient(int patientID){
        this.patientID= patientID;
    }
    public Patient(String lastName) {
        this.lastName = lastName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid Age");
        }
        else {
            this.age = age;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient p = (Patient) obj;
        return this.patientID == p.patientID;
    }

    @Override
    public String toString() {
        return "\n" + "====***patient***====\n" +
                "patientID: \n" + patientID +
                " firstName: " + firstName + "\n" +
                " lastName: " + lastName + "\n" +
                " age: " + age +
                " doctor: " + doctor + "\n" +
                " illness: " + illness + "\n" +
                " admissionDate: " + admissionDate + "\n";
    }
}
