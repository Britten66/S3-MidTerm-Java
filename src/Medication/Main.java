package Medication;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            MedicationTrackingSystem system = new MedicationTrackingSystem();
            // Data for doctors, patients, medications and prescriptions.
            Doctor doc1 = new Doctor(34,"Scamper Scamper", 69, "7093456543","dogs");
            Patient pat1 = new Patient(32, "Steven seagull",32, "7098766789");
            Medication med1 =  new Medication(432,"Oxycontin", "One pill before bed", LocalDate.of(2026,6,6));
            Prescription p1 = new Prescription(1001, doc1, pat1, med1, LocalDate.of(2026, 2, 28).plusYears(1));
            //Add to system
            system.addDoctor(doc1);
            system.addPatient(pat1);
            system.addMedication(med1);
            system.addPrescription(p1);

            Doctor doc2 = new Doctor(30, "Bat Man", 37, "7091233456", "BadGuys");
            Patient pat2 = new Patient(43, "Bender", 20, "1011011010");
            Medication med2 = new Medication(23, "WD-40", "Three times a day, on all joints", LocalDate.of(2027,2,28));
            Prescription p2 = new Prescription(1002, doc2, pat2, med2, LocalDate.of(2026, 2, 28).plusYears(1));

            system.addDoctor(doc2);
            system.addPatient(pat2);
            system.addMedication(med2);
            system.addPrescription(p2);

            Doctor doc3 = new Doctor(301, "Dr. Dolittle", 42, "555-0123", "Veterinary");
            Patient pat3 = new Patient(901, "Scooby Doo", 7, "800-726-6291");
            Medication med3 = new Medication(77, "Scooby Snacks", "One per mystery", 50, LocalDate.of(2028, 12, 25));
            Prescription p3 = new Prescription(1003, doc3, pat3, med3, LocalDate.of(2026, 2, 28).plusYears(1));

            system.addDoctor(doc3);
            system.addPatient(pat3);
            system.addMedication(med3);
            system.addPrescription(p3);

            Doctor doc4 = new Doctor(401, "Doc Brown", 65, "121-1985", "Temporal Physics");
            Patient pat4 = new Patient(902, "Marty McFly", 17, "555-888-2311");
            Medication med4 = new Medication(88, "Plutonium", "Handle at 88mph", 10, LocalDate.of(1955, 11, 5));
            Prescription p4 = new Prescription(1004, doc4, pat4, med4, LocalDate.of(2026, 2, 28).plusYears(1));

            system.addDoctor(doc4);
            system.addPatient(pat4);
            system.addMedication(med4);
            system.addPrescription(p4);

            // quit set too false to keep the while loop running until the user enters 'quit'
            boolean quit = false;
            // Menu while loop
            Scanner scanner = new Scanner(System.in);
            while(!quit){
                // Menu for the medication tracking system
                System.out.println("****** RVThereYet Pharmacy Medication Tracking System ******");
                System.out.println();
                System.out.println("Enter a number for the corresponding option");
                System.out.println();
                System.out.println("****** Patients ******");
                System.out.println("1. Add new patient");
                System.out.println("2. Delete patient");
                System.out.println("3. Update patient information");
                System.out.println("4. Search for patient by name");
                System.out.println("5. Assign patient to a doctor");
                System.out.println();
                System.out.println("****** Medications ******");
                System.out.println("6. Add new medication");
                System.out.println("7. Delete medication");
                System.out.println("8. Update medication information");
                System.out.println("9. Search for medication by name");
                System.out.println("10. Check for expired medication");
                System.out.println("11. Restock medication");
                System.out.println();
                System.out.println("****** Doctors ******");
                System.out.println("12. Add new doctor");
                System.out.println("13. Delete doctor");
                System.out.println("14. Update doctor information");
                System.out.println("15. Search for doctor by name");
                System.out.println();
                System.out.println("****** Reports ******");
                System.out.println("16. Full system report");
                System.out.println("17. Expired medication report");
                System.out.println("18. List of prescription prescribed by doctor");
                System.out.println();
                System.out.println("Enter 'Quit' to stop program ");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Enter patient id:");
                        int idPatient = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter patient name:");
                        String namePatient = scanner.nextLine();
                        System.out.println("Enter patient age:");
                        int agePatient = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter patient phone number:");
                        String phoneNumberPatient = scanner.nextLine();
                        system.addPatient(new Patient(idPatient,namePatient,agePatient,phoneNumberPatient));
                        break;
                    case 2:
                        System.out.println("Enter ID of patient to delete");
                        int deletePatient = scanner.nextInt();
                        scanner.nextLine();
                        system.deletePatient(deletePatient);
                        break;
                    case 3:
                        System.out.println("Enter patient id:");
                        int updateIdPatient = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter patient name:");
                        String updateNamePatient = scanner.nextLine();
                        System.out.println("Enter patient age:");
                        int updateAgePatient = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter patient phone number:");
                        String updatePhoneNumberPatient = scanner.nextLine();
                        scanner.nextLine();
                        system.updatePatient(updateIdPatient,updateNamePatient,updateAgePatient,updatePhoneNumberPatient);
                        break;
                    case 4:
                        System.out.println("Enter ID of patient to delete");
                        String searchPatientName = scanner.nextLine();
                        system.searchPatientByName(searchPatientName);
                        break;

                        // Adding patient to doctor will req a new scanner and prompt user
                        // this will req by id and be in two seperate inputs

                    case 5:


                        System.out.println("Enter Patient ID: ");
                        int patientId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Doctor ID");
                        int doctorId = scanner.nextInt();
                        scanner.nextLine();
                        system.addPatientToDoctor(patientId, doctorId);
                        break;



                    case 6:
                        System.out.println("Enter medication id:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter medication name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter medication dosage:");
                        String dose = scanner.nextLine();
                        System.out.println("Enter medication stock:");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter medication expiry date yyyy-mm-dd:");
                        System.out.println("Enter year");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter month");
                        int month = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter day");
                        int day = scanner.nextInt();
                        scanner.nextLine();
                        LocalDate expiryDate = LocalDate.of(year,month,day);
                        system.addMedication(new Medication(id, name, dose, stock, expiryDate));
                        break;
                    case 7:
                        System.out.println("Enter the medications id that you want to delete");
                        int deleteId = scanner.nextInt();
                        system.deleteMedication(deleteId);
                        break;
                    case 8:
                        System.out.println("Enter medication id:");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter medication name:");
                        String updateName = scanner.nextLine();
                        System.out.println("Enter medication dosage:");
                        String updateDose = scanner.nextLine();
                        System.out.println("Enter medication stock:");
                        int updateStock = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter medication expiry date yyyy-mm-dd:");
                        System.out.println("Enter year");
                        int updateYear = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter month");
                        int updateMonth = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter day");
                        int updateDay = scanner.nextInt();
                        scanner.nextLine();
                        LocalDate updateExpiryDate = LocalDate.of(updateYear,updateMonth,updateDay);
                        system.updateMedication(updateId, updateName, updateDose, updateStock,updateExpiryDate);
                        break;
                    case 9:
                        System.out.println("Enter medication name to search");
                        String searchName = scanner.nextLine();
                        system.searchMedicationByName(searchName);
                        break;
                    case 10:
                        system.checkMedicationExpiryDate();
                        break;
                    case 11:
                        system.restockMedication();
                        break;
                    case 12:
                        System.out.println("Enter doctor id:");
                        int idDoctor = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter doctor name:");
                        String nameDoctor = scanner.nextLine();
                        System.out.println("Enter doctor age:");
                        int ageDoctor = scanner.nextInt();
                        System.out.println("Enter doctor phone number:");
                        String phoneNumberDoctor = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Enter doctor specialization:");
                        String specializationDoctor = scanner.nextLine();
                        system.addDoctor(new Doctor(idDoctor,nameDoctor,ageDoctor, phoneNumberDoctor, specializationDoctor));
                        break;
                    case 13:
                        System.out.println("Enter ID of doctor to be deleted");
                        int deleteDoctor = scanner.nextInt();
                        scanner.nextLine();
                        system.deleteDoctor(deleteDoctor);
                        break;

                        // scanner input for updating doctor info
                        // giving print statemtns to user to ask for input
                        // switch case will accept user input via the method its passing

                    case 14:

                        System.out.println("Enter Doctor Id: ");
                        int updateDocId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter New Name");
                        String updateDoctorName = scanner.nextLine();
                        System.out.println("Enter New Age");
                        int updateAgeDoctor = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter new Phone Number");
                        String updatePhoneDoctor = scanner.nextLine();
                        system.updateDoctor(updateDocId, updateDoctorName, updateAgeDoctor, updatePhoneDoctor);
                        break;



                        // searching doctor by name
                        // this will accept a name using the search by name method

                    case 15:

                        System.out.println("Enter doctor name that you want to search ");
                        String searchDoctorName = scanner.nextLine();
                        system.searchDoctorByName(searchDoctorName);

                        break;








                    case 16:
                        system.fullSystemReport();
                        break;
                    case 17:

                        system.expiredMedicationReport();
                        break;
                    case 18:
                        System.out.println("Enter name of doctor for prescription report");
                        String reportName = scanner.nextLine();
                        system.prescriptionsByDoctorReport(reportName);
                        break;



                    case 19:
                        quit = true;
                        System.out.println("System shutting down");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }

}
