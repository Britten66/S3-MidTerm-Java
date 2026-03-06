package Medication;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrescriptionDemo {
//    public static ArrayList<Prescription> prescriptions = new ArrayList<>();
    public static void main(String[] args){
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        // Data for doctors, patients, medications and prescriptions.
        // Prescription 1
        Doctor doc1 = new Doctor(34,"Scamper Scamper", 69, "7093456543","dogs");
        Patient pat1 = new Patient(32, "Steven seagull",32, "7098766789");
        Medication med1 =  new Medication(432,"Oxycontin", "One pill before bed", LocalDate.of(2000,6,6));
        Prescription p1 = new Prescription(1001, doc1, pat1, med1, LocalDate.of(2025, 9, 20).plusYears(1));
        // Prescription 2
        Doctor doc2 = new Doctor(30, "Bat Man", 37, "7091233456", "BadGuys");
        Patient pat2 = new Patient(43, "Bender", 20, "1011011010");
        Medication med2 = new Medication(23, "WD-40", "Three times a day, on all joints", LocalDate.of(2027,2,28));
        Prescription p2 = new Prescription(1002, doc2, pat2, med2, LocalDate.of(2025, 6, 15).plusYears(1));
        // Prescription 3
        Doctor doc3 = new Doctor(301, "Dr. Dolittle", 42, "555-0123", "Veterinary");
        Patient pat3 = new Patient(901, "Scooby Doo", 7, "8007266291");
        Medication med3 = new Medication(77, "Scooby Snacks", "One per mystery", 50, LocalDate.of(2028, 12, 25));
        Prescription p3 = new Prescription(1003, doc3, pat3, med3, LocalDate.of(2025, 10, 28).plusYears(1));
        // Prescription 4
        Doctor doc4 = new Doctor(401, "Doc Brown", 65, "121-1985", "Temporal Physics");
        Patient pat4 = new Patient(902, "Marty McFly", 17, "5558882311");
        Medication med4 = new Medication(88, "Plutonium", "Handle in evening at 88mph", 10, LocalDate.of(1955, 11, 5));
        Prescription p4 = new Prescription(1004, doc4, pat4, med4, LocalDate.of(2026, 2, 28).plusYears(1));

        // Print out prescription
        System.out.println();
        System.out.println("Prescription 1 created: " + p1);
        System.out.println();
        System.out.println("Prescription 2 created: " + p2);

        // Extraction info from the prescription with getters
        System.out.println();
        System.out.println("Prescription 1 Info");
        System.out.println("Patient:");
        System.out.println("ID: " + p1.getPatient().getId());
        System.out.println("Name: " + p1.getPatient().getName());
        System.out.println("Patient's doctor: " + p1.getDoctor().getName());
        System.out.println("Patient's phone number: " + p1.getPatient().getPhoneNumber());
        System.out.println("Age: " + p1.getPatient().getAge());
        System.out.println("Medication patient is taking: " + p1.getMedication().getName());
        System.out.println("Dosage: " + p1.getMedication().getDose());
        System.out.println("Med ID: " + p1.getMedication().getId());
        System.out.println();
        System.out.println("Doctor:");
        System.out.println("ID: " + p1.getDoctor().getId());
        System.out.println("Name: " + p1.getDoctor().getName());
        System.out.println("Age: " + p1.getDoctor().getAge());
        System.out.println("Specialization: " + p1.getDoctor().getSpecialization());
        System.out.println();
        System.out.println("Medication:");
        System.out.println("ID: " + p1.getMedication().getId());
        System.out.println("Name: " + p1.getMedication().getName());
        System.out.println("Dose: " + p1.getMedication().getDose());
        System.out.println("Quantity in stock: " + p1.getMedication().getQuantityInStock());
        System.out.println("Expiry date: " + p1.getMedication().getExpiryDate());
        System.out.println();
        System.out.println("Prescription expiry date");
        System.out.println(p1.getPrescriptionExpiry());

        // set doctors name on the prescription
        System.out.println();
        p1.getDoctor().setName("Billy bob");
        System.out.println("Updated doctors name on prescription 1: " + p1.getDoctor().getName());
        System.out.println();
        // set new doctor object in prescription p1
        System.out.println("Set new doctor on prescription 1: ");
        p1.setDoctor(new Doctor(30, "Bat Man", 37, "7091233456", "BadGuys"));
        System.out.println(p1.getDoctor());
        System.out.println("Medication quantity:");
        // set medication quantity for prescription p1
        p1.getMedication().setQuantityInStock(10);
        System.out.println("Set quantity in stock for medication in prescription 1: ");
        System.out.println(p1);
        System.out.println();
        p1.getMedication().setName("OxyContin Revised");
        System.out.println(p1);
        System.out.println();

        // adding object to the system arraylists
        system.addDoctor(doc1);
        system.addPatient(pat1);
        system.addMedication(med1);
        system.addPrescription(p1);

        system.addDoctor(doc2);
        system.addPatient(pat2);
        system.addMedication(med2);
        system.addPrescription(p2);

        system.addDoctor(doc3);
        system.addPatient(pat3);
        system.addMedication(med3);
        system.addPrescription(p3);

        system.addDoctor(doc4);
        system.addPatient(pat4);
        system.addMedication(med4);
        system.addPrescription(p4);

        // restock medication
        System.out.println();
        System.out.println("Restock medication");
        system.restockMedication();

        // search for medicationByName
        System.out.println();
        System.out.println("Search for medication by name");
        system.searchMedicationByName("Scooby Snacks");

        // Search for prescription by doctor name and print report
        System.out.println();
        system.prescriptionsByDoctorReport("Dr. Dolittl");

        // search for expired medication
        System.out.println();
        System.out.println("Expired medication:");
        system.checkMedicationExpiryDate();

        // print expired medication report
        System.out.println();
        system.expiredMedicationReport();

        // delete medication from prescription p3
        System.out.println("Delete medication from prescription 3");
        system.deleteMedication(77);
        system.searchMedicationByName("Scooby Snacks");

        // print full system report
        System.out.println();
        system.fullSystemReport();

        // print prescription for the last year for patient
        System.out.println();
        system.patientsPrescriptionLastYearReport("Steven seagull");
    }
}
