package Medication;

import java.time.LocalDate;

public class PrescriptionDemo {

    public static void main(String[] args){
        Prescription p1 = new Prescription(101, new Doctor(34,"Scamper Scamper", 69, "7093456543","dogs"),
                new Patient(32, "Steven seagull",32, "7098766789"),
                new Medication(432,"oxy", "One pill in the last evening", LocalDate.of(2026,6,6)),
                LocalDate.of(2026,2,10));
        System.out.println(p1.getPrescriptionExpiry());
    }
}
