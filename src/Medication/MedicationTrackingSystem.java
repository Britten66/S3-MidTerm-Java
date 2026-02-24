package Medication;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class MedicationTrackingSystem {


    // here are the private variables that link to the classes made

private List<Patient> patients;
private List<Doctor> doctors;
private List<Medication> medications;
private List<Prescription> prescriptions;


// creating the default constructor for the medication tracking system here

    public MedicationTrackingSystem(){

        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }


    // adding a patient to doctor - we did this in the test class driving tests forward as development progresses

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
    // since we will be using scanner and don't have anything set to a value here is a alt method with a loop like the test.

    // here is the remove patient as a loop

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

    // Method to add a new medication.
    public void addMedication(Medication medication){
        medications.add(medication);
        System.out.println("Medication " + medication.getName() + " added" );
    }

    // Method to restock medication.
    public void restockMedication(int quantityInStock){
        // loop through medications to find medications that need to be restocked.
        for(int i = 0; 1 < medications.size(); i++){
            if(medications.get(i).getQuantityInStock() == 0){
                System.out.println("Medication " + medications.get(i).getName() + "needs to be restocked.");
                medications.get(i).setQuantityInStock(quantityInStock);
            }
        }
        System.out.println("Medications does not need to be restocked");
    }

        // Method to update medication.
    public void updateMedication(int id, String name, String dose, LocalDate expiryDate){
        // loop through medications to find by id and update its information
        for (Medication medication : medications) {
            if (medication.getId() == id) {
                medication.setName(name);
                medication.setDose(dose);
                medication.setExpiryDate(expiryDate);
                System.out.println("Medicated Updated.");
                return;
            }
        }
        System.out.println("Medication Not Found!");
    }

        // Method to delete medication.
    public void deleteMedication(int id){

        for(int i = 0; i < medications.size(); i++){

            if (medications.get(i).getId() == id) {
                medications.remove(i);
                System.out.println("Medicated deleted");
                return;
            }
        }
        System.out.println("Medication Not Found!");
    }

    public void checkExpiryDate(LocalDate expiryDate){
        LocalDate currentDate = LocalDate.now();
        for (Medication medication : medications) {
            if (medication.getExpiryDate().isBefore(currentDate)) {
                System.out.println("Medication" + medication.getName() + "was expired on " + medication.getExpiryDate());
            }
        }
        System.out.println("No expired medication found!");
    }

    public void fullSystemReport(){
        for(Doctor doctor: doctors){
            System.out.println("Doctor " + doctor.getName() + "\n" +
                    " - " + doctor.getId() + " \n" +
                    " - " + doctor.getSpecialization()+ " \n" +
                    " - " + doctor.getAge() + "\n" +
                    " - " + doctor.getPhoneNumber() +"\n" +
                    " - " + doctor.getPatients());
            }
        for(Patient patient : patients){
            System.out.println("Patient " + patient.getName() + "\n" +
                    " - " + patient.getId() + "\n" +
                    " - " + patient.getPhoneNumber() + "\n" +
                    " - " + patient.getAge());
        }
        for(Medication medication : medications){
            System.out.println("Medication " + medication.getName() + "\n" +
                    " - " + medication.getId() + "\n" +
                    " - " + medication.getDose() + "\n" +
                    " - " + medication.getQuantityInStock() + "\n" +
                    " - " + medication.getExpiryDate());
        }
    }


    }
