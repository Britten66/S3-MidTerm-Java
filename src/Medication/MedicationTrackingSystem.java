package Medication;



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

    public MedicationTrackingSystem() {

        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }


    // adding a patient to doctor - we did this in the test class driving tests forward as development progresses

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added");

    }


    //       public void deletePatient(Patient patient){
    //        patients.remove(patient);
    //        System.out.println(("Patient " + patient.getName()) + " removed");

    //      we can only call .remove if java see's an object created
    //       since we will be using scanner and dont have anything set to a value here is a alt method with a loop like the test.
    // we can only call .remove if java see's an object created
    // since we will be using scanner and don't have anything set to a value here is a alt method with a loop like the test.

    // here is the remove patient as a loop

    public void deletePatient(int id) {

        // this is looping through  patients
        for (int i = 0; i < patients.size(); i++) {

            if (patients.get(i).getId() == id) {
                // remove at the position found

                patients.remove(i);
                System.out.println("Patient Removed");

                //return will stop the loop
                return;
            }
        }


        // this will get printed if nothing found
            // this will get printed if nothing found
        System.out.println("No Patient Under That Name Found");
    }





    public void updatePatient(int id, String newName, int newAge, String newPhone) {

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

    // adding doctor ..similar to add patient this will include the doctor.add part

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor: " + doctor.getName() + " added ");


    }


    // removing a doctor will be the same as patient as .remove wont be applicable in this case

    public void deleteDoctor(int id) {

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == id) {

                doctors.remove(i);
                System.out.println("Doctor Removed");

            }


        }
    }

    // update doctor
    // similar to last it will include for loop but go through each and prompt for an update

    public void updateDoctor(int id, String newName, int newAge, String newPhone) {

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == id) {
                doctors.get(i).setName(newName);
                doctors.get(i).setAge(newAge);
                doctors.get(i).setNewPhone(newPhone);

                System.out.println("Doctor Updated");
                return;
            }

        }


        System.out.println("No Doctor Found");

    }

    //searching doctor by name will be same search as before

    public void searchDoctor(String name) {

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equalsIgnoreCase(name)) {

                System.out.println("Doctor found: " + doctors.get(i));

                return;

            }
            System.out.println("NO doctor found");
        }
    }


    // adding a patient to the doctor
    // this will find both id's and link the 2

    //they will both will need to be set to null starting off

        public void addPatientToDoctor(int patientId, int doctorId) {

            // setting found variables to null

            Patient foundPatient = null;
            Doctor foundDoctor = null;

            // looping through patients for id

            for (int i = 0; i < patients.size(); i++) {

                if (patients.get(i).getId() == patientId) {
                    foundPatient = patients.get(i);
                }

            }

            // looping through doctors for id

            for (int i = 0; i < doctors.size(); i++) {


                if (doctors.get(i).getId() == doctorId) {
                    foundDoctor = doctors.get(i);
                }
            }
            if (foundPatient != null && foundDoctor != null) {
                foundDoctor.addPatient((foundPatient));

            System.out.println("Patient added to Doctor");
        } else {
                System.out.println("Patient or Doctor Not Found");
            }
        }

            // Method to add a new medication.
            public void addMedication(Medication medication){
                medications.add(medication);
                System.out.println("Medication " + medication.getName() + " added" );
            }

             // Method to restock medication


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


    // Method to search for expired medication and print a report.


    public void checkExpiryDateReport(LocalDate expiryDate){
        LocalDate currentDate = LocalDate.now();
        System.out.println("****** Medication Expiry Report ****** \n");
        for (Medication medication : medications) {
            if (medication.getExpiryDate().isBefore(currentDate)) {
                System.out.println("Medication" + medication.getName() + "was expired on " + medication.getExpiryDate() + "\n");
            }
        }
        System.out.println("No expired medication found!");
    }

    // Method to print a full system report, doctors patients in the system.
    public void fullSystemReport(){
        System.out.println("****** System Report ****** \n");
        // loop through and print doctors in the system.
        for(Doctor doctor : doctors){
            System.out.println("Doctor " + doctor.getName() + "\n" +
                    " - " + doctor.getId() + " \n" +
                    " - " + doctor.getSpecialization()+ " \n" +
                    " - " + doctor.getAge() + "\n" +
                    " - " + doctor.getPhoneNumber() +"\n" +
                    " - " + doctor.getPatients());
            }
        // loop through nad print patients in the system.
        for(Patient patient : patients){
            System.out.println("Patient " + patient.getName() + "\n" +
                    " - " + patient.getId() + "\n" +
                    " - " + patient.getPhoneNumber() + "\n" +
                    " - " + patient.getAge());
        }
        // loop through and print medications in the system.
        for(Medication medication : medications){
            System.out.println("Medication " + medication.getName() + "\n" +
                    " - " + medication.getId() + "\n" +
                    " - " + medication.getDose() + "\n" +
                    " - " + medication.getQuantityInStock() + "\n" +
                    " - " + medication.getExpiryDate());
        }
    }

    // Method to print a report of a doctor and their prescriptions prescribed.
    public void prescriptionsByDoctorIdReport(int id){
        System.out.println("****** Prescriptions prescribed by Doctor ****** \n");
        for(Doctor doctor: doctors){
            if(doctor.getId() == id){
                System.out.println("Doctor " + doctor.getName());
                for(Prescription prescription: prescriptions){
                    System.out.println("Prescriptions: " + "\n" +
                                    prescription.getMedication() + "\n" +
                                    prescription.getPatient() + " \n");
                }
            }
        }
    }
   }







































