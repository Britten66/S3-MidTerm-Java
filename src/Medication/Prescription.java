package Medication;

import java.time.LocalDate;

public class Prescription extends Medication {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate prescriptionExpiry;
    // no argument constructor here .. this was required
    public Prescription() {}
        public Prescription(int id, Doctor doctor, Patient patient, Medication medication, LocalDate prescriptionExpiry){
            this.id = id;
            this.doctor = doctor;
            this.patient = patient;
            this.medication = medication;
            this.prescriptionExpiry = prescriptionExpiry;
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

    public LocalDate getPrescriptionExpiry() {
        return prescriptionExpiry;
    }

    public void setPrescriptionExpiry(LocalDate prescriptionExpiry) {
        this.prescriptionExpiry = prescriptionExpiry;
    }

    public String toString() {
        return "ID: " + this.id + "Doctor: " + this.doctor + "\n" + " Patient: " + this.patient + "\n"
                + " Medication: " + this.medication + "\n" + " Medication expiry date: " + this.prescriptionExpiry;
    }
}

