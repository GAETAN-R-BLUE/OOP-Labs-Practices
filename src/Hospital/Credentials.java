package Hospital;

import java.util.Scanner;

public class Credentials {

    public static Patient getPatientCredential(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = userInput.nextLine();

        System.out.println("Enter Last Name");
        String lastName = userInput.nextLine();

        System.out.println("Enter the patient age");
        int age = userInput.nextInt();

        System.out.println("Enter the patient ID");
        int patientID = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Enter the patient illness");
        String illness = userInput.nextLine();

        System.out.println("Admission date");
        String admissionDate = userInput.nextLine();

        System.out.println("Enter the doctor's name");
        String doctor = userInput.nextLine();

        Patient newpatient = new Patient(lastName,firstName,doctor,patientID,illness,admissionDate, age);
        return newpatient;

    }
}
