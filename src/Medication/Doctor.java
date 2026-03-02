package Medication;

// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:       A Doctor class that allows the user of end sysstem to add patients / doctor and list patients per doctor added
//also inherits Person to give each member and ID,Name,Age, Phonenumber - and doctor a specialization
// Time Allocated: 2 weeks

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Patient {

    private String specialization;
    private List<Patient> patients;

    public Doctor(int id, String name, int age, String phoneNumber, String specialization){
        super(id, name, age, phoneNumber);
        this. specialization = specialization;
        this.patients = new ArrayList<>();

        }


    // getters here Doctor will reutrn patients and speciilaztion


    public String getSpecialization(){
        return specialization;
    }

    public List<Patient> getPatients(){
        return patients;
    }



    //setters here same thing return nothing and use .this

    public void setSpecialization(String specialization ){
        this.specialization = specialization;
    }

    public void setPatients(List<Patient> patients){
        this.patients = patients;
    }

    // here we will have methods to add
    // each pateint once at a time

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    // tostring "" + "" finish off


    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Patients " + patients.size();

    }
}
