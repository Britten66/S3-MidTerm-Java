package Medication;


// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:        Patient class - extends Person, holds medications and prescriptions
// Time Allocated: 2 weeks

import java.util.ArrayList;
import java.util.List;

// this extends Person meaning that Patient will inherit all of Person's attributes, id name etc
// extending Person class ( this is showcasing inheritance )

public class Patient extends Person {

    // assigning list to other class
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    public Patient(int id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // getters here - going to be getting private variables from Justin's classes
    // otherwise this is also commonly known as encapsulation
    // returning them outside of the private class makes them accessible

    public List<Medication> getMedications() {
        return medications;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    // setters are here
    // this can be referred to as data hiding
    // setters utilize encapsulation to show the data outside the private class

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    // medications need to be registered one at a time as per requirement

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }

    public String toString() {
        return super.toString() + ", Medications: " + medications.size() + ", Prescriptions: " + prescriptions.size();
    }
}