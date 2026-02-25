package Medication;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            MedicationTrackingSystem system = new MedicationTrackingSystem();
            // quit set too false to keep the while loop running until the user enters 'quit'
            boolean quit = false;
            // Menu while loop
            while(!quit){
                Scanner scanner = new Scanner(System.in);
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
                        system.addPatient(scanner, system);
                        break;
                    case 2:
                        system.deletePatient(scanner, system);
                        break;
                    case 3:
                        system.updatePatient(scanner, system);
                        break;
                    case 4:
                        system.searchPatientByName(scanner, system);
                        break;
                    case 5:
                        system.addPatientToDoctor(scanner, system);
                        break;
                    case 6:
                        system.addMedication(scanner, system);
                        break;
                    case 7:
                        system.deleteMedication(scanner,system);
                        break;
                    case 8:
                        system.updateMedication(scanner, system);
                        break;
                    case 9:
                        system.searchMedicationByName();
                        break;
                    case 10:
                        system.checkMedicationExpiryDate();
                        break;
                    case 11:
                        system.restockMedication();
                        break;
                    case 12:
                        system.addDoctor(scanner, system);
                        break;
                    case 13:
                        system.deleteDoctor(scanner, system);
                        break;
                    case 14:
                        system.updateDoctor(scanner, system);
                        break;
                    case 15:
                        system.searchDoctorByName(scanner, system);
                        break;
                    case 16:
                        system.fullSystemReport();
                        break;
                    case 17:
                        system.expriedMedicationReport(scanner, system);
                        break;
                    case 18:
                        system.prescriptionsByDoctorReport();
                        break;
                    case quit:
                        quit = true;
                        System.out.println("System shutting down");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
}
