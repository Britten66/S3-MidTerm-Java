package Medication;


import java.util.ArrayList;
import java.util.List;
public class MedicationTrackingSystem {


    // here are the private variables that link to the classes made

private List<Patient> patients;
private List<Doctor> doctors;
private List<Medication> medications;


// creating the default constructor for the medication tracking system here

    public MedicationTrackingSystem(){

        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.medications = new ArrayList<>();


    }


    // adding a patient to doctor - we did this in the test class driving tests forward as develeopement progresses

    public void addPatient(Patient patient){
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added" );

    }

    public void deletePatient(Patient patient){
        patients.remove(patient);
        System.out.println(("Patient " + patient.getName()) + " removed");

    }

    // we can only call .remove if java see's an object created
    // since we will be using scanner and dont have anything set to a value here is a alt method with a loop like the test.

    public void deletePatient(int id){

        for(int i = 0; i < patients.size(): i++){

            if(patients.get(i).getId() == id){
                patients.remove(i);
                System.out.println("Patient Removed");
                return;
            }
        }

        System.out.println("No Patient Under That Name Found");
    }



    public String updatePatient(Patient
    }



}
