package Hospital;

import MyEmployees.Employee;

public class PatientActions {


    public Patient findPatientByID (PatientList patients, int ID){
        for (Patient patient : patients ){
            if (ID == patient.getPatientID()){
                return patient;
            }
        }
        System.out.println("Patient not found");
        return null;
    }

    public void  dischargePatient (){
        System.out.println("Patient discharged");
    }

    public void  deletePatient (){
        System.out.println("Patient Deleted");
    }

}
