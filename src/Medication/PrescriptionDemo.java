package Medication;

import java.time.LocalDate;

public class PrescriptionDemo {

    public static void main(String[] args){
        Prescription p1 = new Prescription(101,
                new Doctor(34,"Scamper Scamper", 69, "7093456543","dogs"),
                new Patient(32, "Steven seagull",32, "7098766789"),
                new Medication(432,"Oxycodo", "One pill before bed", LocalDate.of(2026,6,6)),
                LocalDate.of(2026,2,10).plusYears(1));

        Prescription p2 = new Prescription(201,
                new Doctor(30, "Bat Man", 37, "7091233456", "BadGuys"),
                new Patient(43, "Bender", 20, "1011011010"),
                new Medication(23, "WD-40", "Three times a day, on all joints", LocalDate.of(2027,2,28)),
                LocalDate.of(2026,2,10).plusYears(1));

        Prescription p3 = new Prescription(301,
                new Doctor(55, "Dr. Dolittle", 42, "5550123456", "Animals"),
                new Patient(99, "Scooby Doo", 7, "8007266291"),
                new Medication(77, "Scooby Snacks", "One per mystery solved", LocalDate.of(2028, 12, 25)),
                LocalDate.of(2026, 2, 28).plusYears(1));

        Prescription p4 = new Prescription(401,
                new Doctor(90, "Doc Brown", 65, "1211985195", "Time Travel"),
                new Patient(12, "Marty McFly", 17, "5558882311"),
                new Medication(88, "Plutonium", "Handle with care at 88mph", LocalDate.of(1955, 11, 5)),
                LocalDate.of(2026, 2, 28).plusYears(1))

        System.out.println("Doctor - " + p1.getDoctor());
        System.out.println("Medication - " + p1.getMedication());
        System.out.println("Prescription Expiry Date - " + p1.getPrescriptionExpiry());

    }
}
