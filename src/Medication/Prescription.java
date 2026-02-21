package Medication;
import pharmacy.Person;

public class Prescription {
    private int id;
    private Person doctor;
    private Person patient;
    private Medication medication;
    private Medication expiryDate;

        public Prescription(){}

        public Prescription(int id, Person doctor, Person patient, Medication medication, Medication expiryDate){
            this.id = id;
            this.doctor = doctor;
            this.patient = patient;
            this.medication = medication;
            this.expiryDate = expiryDate;
        }

        
}

