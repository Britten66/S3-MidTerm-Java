package Medication;

// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:        Patient class - extends Person, holds medications and prescriptions
// Time Allocated: 2 weeks


// this extends Person meaning that Patient will inherit all of Persons attributres , id name etc

    import java.util.ArrayList;
    import java.util.List;


    // extending Person class ( this is showcasing inheritance )

    public class Patient extends Person {

        // assigning list to other class

        private List<Medication> medications;
        private List<Prescription> prescriptions;


    public Patient(int id, String name, int age, String phoneNumber) {

        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }


        // getters here - going to be getting private variables from Justin's classes
        // otherwise this is also commonly known as encapsulation
        // returning them outside of the private class makes them accessable



        public List<Medication> getMedications(){




        return medications;
        }


        public List<Prescription> getPrescriptions(){




        return prescriptions;
        }


        //setters are here this is

        // this can be refered to as data hiding, if we are discussing with somone non technical
        // setters utilize encapulation and abstration to show the data outside the private class



        public void setMedications(List<Medication> medications) {

        this.medications = medications;


        }

        public void setPrescriptions(List<Prescription> prescriptions){

        this.prescriptions = prescriptions;

        }

        // this medications need to be registared one at a time as per requirment
        // this needs a helper to handle any errors that may come up

        public void addMedication(Medication medication){

        this.medications.add(medication);
        }

        public void addPrescription(Prescription prescription){

        this.prescriptions.add(prescription);
        }






        public String toString(){
        return super.toString() + ", Medications " + medications.size() + "< Prescriptions " + prescriptions.size();




    }
}



//some messy notes im leaving for showing thought process


//super sends to parent to store as child cannot store it


// getters for medicaiton and perscription will go here
// remember to return medication and perscriptiuon

// setters will be below
//same thing but using .this
//and return nothing .. void




// rememver to print out returning super