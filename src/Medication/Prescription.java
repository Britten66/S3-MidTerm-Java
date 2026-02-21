package Medication;
import pharmacy.Person;

public class Prescription{
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getDoctor() {
        return doctor;
    }

    public void setDoctor(Person doctor) {
        this.doctor = doctor;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Medication getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Medication expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Prescription information - " + "ID:" + this.id + " Doctor: " + this.doctor + " Patient: " + this.patient
                + "Medication: " + this.medication + "Medication expiry date: " + this.expiryDate;
    }
}

