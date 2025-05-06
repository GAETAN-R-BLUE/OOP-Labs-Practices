package Hospital;
import java.util.ArrayList;

public class PatientList extends  ArrayList <Patient> {
    // Field: Holds a list of Patient objects

    //  Method: Adds a Patient object to the list
    public void addPatient(Patient patient) {
        this.add(patient); // Uses ArrayList's add method
    }

    //  Method: Prints all patients in the list

    public void printPatients() {
        System.out.println("=== PATIENT LIST ===");
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
            // Each Patient's toString() method is automatically called
        }
    }
    public Patient findPatientByID (int ID){
        for (Patient patient : this ){
            if (ID == patient.getPatientID()){
                return patient;
            }
        }
        System.out.println("Patient not found");
        return null;
    }

    public void  deletePatient (int ID){
        for (int i = 0; i < this.size(); i++) {
        if (this.get(i).getPatientID() == ID) {
            this.remove(i);
            break;
        }
    }
    }

}
