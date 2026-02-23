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

//    public void deletePatient(Patient patient){
//        patients.remove(patient);
//        System.out.println(("Patient " + patient.getName()) + " removed");
//
//    }

    // we can only call .remove if java see's an object created
    // since we will be using scanner and dont have anything set to a value here is a alt method with a loop like the test.

    // here is the remove patient as a loop '


    public void deletePatient(int id){


        // this is looping through  patients
        for(int i = 0; i < patients.size(); i++){

            if(patients.get(i).getId() == id){
                // remove at the position found

                patients.remove(i);
                System.out.println("Patient Removed");

                //return will stop the loop
                return;


            }
        }


            // this will get printed if nothing found
        System.out.println("No Patient Under That Name Found");

    }

    public






    public void updatePatient(int id, String newName, int newAge, String newPhone){


        // for loop searching through the patients again

        for(int i = 0; i < patients.size(); i++){

            if (patients.get(i).getId() == id) {
                patients.get(i).setName(newName);
                patients.get(i).setAge(newAge);
                patients.get(i).setNewPhone(newPhone);
                System.out.println("Patient Updated");
                return;

            }

        }

        System.out.println("Patient Not Found!");


    }



}
