package Medication;

import java.time.LocalDate;

public class PrescriptionDemo {

    public static void main(String[] args){
        Prescription p1 = new Prescription(101,
                new Doctor(34,"Scamper Scamper", 69, "7093456543","dogs"),
                new Patient(32, "Steven seagull",32, "7098766789"),
                new Medication(432,"Oxycodo", "One pill before bed", LocalDate.of(2026,6,6)),
                LocalDate.of(2026,2,10).plusYears(1));

        System.out.println("Doctor - " + p1.getDoctor());
        System.out.println("Medication - " + p1.getMedication());
        System.out.println("Prescription Expiry Date - " + p1.getPrescriptionExpiry());

    }
}
