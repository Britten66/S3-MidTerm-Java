package Medication;

// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:        Doctor class - extends Person, holds specialization and patient list
// Time Allocated: 2 weeks

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {

        private String specialization;
        private List<Patient> patients;

        public Doctor(int id, String name, int age, String phoneNumber, String specialization) {
                super(id, name, age, phoneNumber);
                this.specialization = specialization;
                this.patients = new ArrayList<>();
        }

        // getters - Doctor will return patients and specialization

        public String getSpecialization() {
                return specialization;
        }

        public List<Patient> getPatients() {
                return patients;
        }

        // setters - return nothing and use this

        public void setSpecialization(String specialization) {
                this.specialization = specialization;
        }

        public void setPatients(List<Patient> patients) {
                this.patients = patients;
        }

        // adds each patient one at a time

        public void addPatient(Patient patient) {
                this.patients.add(patient);
        }

        public String toString() {
                return super.toString() + ", Specialization: " + specialization + ", Patients: " + patients.size();
        }
}