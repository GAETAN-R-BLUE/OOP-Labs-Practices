// This class is part of the "Hospital" package
package Hospital;

// Imports the Employee class, though it's unused in this file (you can remove this if unnecessary)
import MyEmployees.Employee;

// The Patient class represents a hospital patient with relevant information
public class Patient {

    // === Fields / Attributes ===
    private int patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String doctor;
    private String illness;
    private String admissionDate;
    private boolean discharged;

    // === Constructors ===

    // Default constructor initializes all fields to default or "unknown"
    public Patient() {
        this.lastName = "unknown";
        this.firstName = "unknown";
        this.doctor = "unknown";
        this.patientID = 0;
        this.illness = "unknown";
        this.admissionDate = "unknown";
        this.age = 0;
        this.discharged = false;
    }

    // Full constructor with doctor information
    public Patient(String lastName, String firstName, String Doctor, final int patientID, String illness, String admissionDate, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.doctor = Doctor;
        this.patientID = patientID;
        this.illness = illness;
        this.admissionDate = admissionDate;
        this.age = age;
        this.discharged = false;
    }

    // Constructor without doctor info
    public Patient(String lastName, String firstName, final int patientID, String illness, String admissionDate, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patientID = patientID;
        this.illness = illness;
        this.admissionDate = admissionDate;
        this.age = age;
        this.discharged = false;
    }

    // Constructor with only basic info (no ID, no dates)
    public Patient(String lastName, String firstName, String illness, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.illness = illness;
        this.age = age;
    }

    // Constructor with only name and ID
    public Patient(String lastName, String firstName, final int patientID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patientID = patientID;
    }

    // Constructor with only patientID
    public Patient(int patientID) {
        this.patientID = patientID;
    }

    // Constructor with only last name
    public Patient(String lastName) {
        this.lastName = lastName;
    }

    // === Getter and Setter Methods ===

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

    // Setter includes basic validation (age cannot be negative)
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        } else {
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
    public  void  dischargePatient () {
        this.discharged = true;
    }

    public boolean isDischarged() {
        return discharged;
    }
    // === Object Overrides ===

    // Compares two patients based on their ID only
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false; // null or different class
        Patient p = (Patient) obj;
        return this.patientID == p.patientID;
    }

    // Returns a nicely formatted string representation of the patient object
    @Override
    public String toString() {
        return
                " Patient ID: " + patientID + "\n" +
                " First Name: " + firstName + "\n" +
                " Last Name: " + lastName + "\n" +
                " Age: " + age + "\n" +
                " Doctor: " + doctor + "\n" +
                " Illness: " + illness + "\n" +
                " AdmissionDate: " + admissionDate + "\n";
    }
    public void printPatient (){
        System.out.println(this);
    }
}
