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
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
            // Each Patient's toString() method is automatically called
        }
    }
}
