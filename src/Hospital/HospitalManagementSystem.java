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
                    "3. Delete Patient Info \n" +
                    "4. Discharge Patient \n" +
                    "5. Search Patient \n" +
                    "6. Show Discharged Patient \n" +
                    "6. Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice){
                case 1:{
                    Patient newpatient = Credentials.getCredential();

                    patients.addPatient(newpatient);

                }
                case 2:{
                    patients.printPatients();
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
