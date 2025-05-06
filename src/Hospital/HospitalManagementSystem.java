package Hospital;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        PatientList patients = new PatientList();
        int totalPatient = 0;
        int dischargedCount = 0;
        int deletedCount = 0;


        while (true) {

            System.out.println("\n==== Hospital Management System ====\n" +
                    "1. Add New Patient \n" +
                    "2. View All Patient \n" +
                    "3. Delete Patient Info \n" +
                    "4. Discharge Patient \n" +
                    "5. Search Patient \n" +
                    "6. Show Discharged Patient \n" +
                    "7. Summary \n" +
                    "8. Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1: {
                    Patient newpatient = Credentials.getPatientCredential();
                    patients.addPatient(newpatient);
                    totalPatient++;
                    break;
                }
                case 2: {
                    patients.printPatients();
                    break;
                }
                case 3: {
                    System.out.println("Enter the patient ID to be deleted");
                    int ID = userInput.nextInt();
                    Patient patientToDelete = patients.findPatientByID(ID);

                    if (patientToDelete != null) {
                        patients.deletePatient(ID);
                        System.out.println("Patient Deleted");
                        deletedCount++;
                    }

                    break;
                }
                case 4: {
                    System.out.println("Enter the patient ID to be discharged");
                    int ID = userInput.nextInt();
                    Patient patientToDischarge = patients.findPatientByID(ID);

                    if (patientToDischarge != null) {
                        patientToDischarge.dischargePatient();
                        System.out.println("Patient Discharged");
                        dischargedCount++;
                    }

                    break;
                }
                case 5: {
                    System.out.println("Enter the patient ID");
                    int ID = userInput.nextInt();
                    Patient patient = patients.findPatientByID(ID);
                    if (patient != null) {
                        System.out.println(patient);
                    }
                    break;
                }
                case 6: {
                    System.out.println("==== Discharged Patient ====");
                    for (Patient patientsDischarged : patients) {
                     if (patientsDischarged.isDischarged()) {
                         System.out.println(patientsDischarged);
                     }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Total Patients: " + totalPatient + "\n"
                            + "Discharged Patient: " + dischargedCount + "\n" +
                            "Deleted Patients " + deletedCount);
                    break;
                }
                case 8: {
                    return;
                }
            }
        }
    }
}
