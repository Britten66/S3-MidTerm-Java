package Medication;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            MedicationTrackingSystem system = new MedicationTrackingSystem();
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
                System.out.println("19. Prescription medication prescribed to patient in last year report");
                System.out.println();
                System.out.println("Enter '20' to stop program ");
                int option = scanner.nextInt();
                scanner.nextLine();
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
                        System.out.println("Enter name of patient to generate prescription report");
                        String patientName = scanner.nextLine();
                        system.patientsPrescriptionLastYearReport(patientName);
                        break;
                    case 20:
                        quit = true;
                        System.out.println("System shutting down");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }

}
