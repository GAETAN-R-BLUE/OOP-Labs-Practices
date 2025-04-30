package Hospital;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        PatientList patients = new PatientList();

        while (  true) {

            System.out.println("\n==== Employee Management System ====" + "\n \n" +
                    "1. Add New Patient \n" +
                    "2. View All Patient \n" +
                    "3. Update Patient Info \n" +
                    "4. Discharged Patient \n" +
                    "5. Search Patient \n" +
                    "6. Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Enter firstName");
                    String firstName = userInput.nextLine();

                    System.out.println("Enter Last Name");
                    String lastName = userInput.nextLine();
                    userInput.nextLine();

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
                    patients.addPatient(newpatient);

                   break;
                }
                case 2:{
                    patients.printPatient();
                    break;
                }
                case 3:{
                    System.out.println("choice 3");
                    break;
                }
                case 4:{
                    System.out.println("choice 4");
                    break;
                }
                case 5:{
                    System.out.println("choice 5");
                    break;
                }
                case 6:{
                    return;
                }
            }
        }
    }

}
