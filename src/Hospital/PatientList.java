package Hospital;

import java.util.ArrayList;
public class PatientList {
    private ArrayList <Patient> patientList ;

    public PatientList() {
        patientList = new ArrayList<>();
    }
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    public void printPatient (){
        for (int i = 0; i < patientList.size(); i++) {
            System.out.println(patientList.get(i));
        }
    }
}
