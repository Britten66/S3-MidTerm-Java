package Medication;
import pharmacy.Doctor;
import pharmacy.Patient;

public class Prescription{
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private Medication expiryDate;

        public Prescription(){
        }

        public Prescription(int id, Doctor doctor, Patient patient, Medication medication, Medication expiryDate){
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
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

