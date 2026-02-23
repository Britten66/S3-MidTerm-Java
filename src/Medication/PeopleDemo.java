package Medication;

// these are all positive tests, as we just want to confirm that everything is working as per requirments
// when time is allocated we can add negative tests to account for error handling

public class PeopleDemo {


   public static void main(String[] args) {
       System.out.println();
       System.out.println("Testing For People Classes");

       // first test
       // creating a patient and testing it

       Patient patient01 = new Patient(1, "Peter Parker", 32, "902-444-321");
       System.out.println("Patient Created: " + patient01);


       // second test here
       // testing getters

       System.out.println("ID: " + patient01.getId());
       System.out.println("Name: " + patient01.getName());
       System.out.println("Age: " + patient01.getAge());
       System.out.println("Phone: " + patient01.getPhoneNumber());


       // third test here

       patient01.setName("Bill Nye");
       System.out.println("Updated name: " + patient01.getName());


       System.out.println("Testing for Dooctor Class here");

       // test Four - to see if doctor can be created with success

       Doctor doctor01 = new Doctor(324, "Dr Strange", 129346, "902-777-4232", "Cardiologist");
       System.out.println("Doctor Created: " + doctor01);

       // test Five -- checking getters

       System.out.println("Specialization " + doctor01.getSpecialization());

       // test  here - testing setters to update

       doctor01.setSpecialization("Health Sciences");
       System.out.println("Updated Specialization: " + doctor01.getSpecialization());

       // test six - adding a patient to doctor

       Patient patient02 = new Patient(2, "John Wick", 41, "902-539-8264");
       doctor01.addPatient(patient01);
       doctor01.addPatient(patient02);
       System.out.println("Doctors Patients: " + doctor01.getPatients().size());


       // test eight printing out all patients under each doctor created

       System.out.println("Patients under doctor: " + doctor01.getName() + ":");
       for(Patient p : doctor01.getPatients()) {
           System.out.println( " - " + p.getName());
       }

       System.out.println("Testing complete");
   }
}
