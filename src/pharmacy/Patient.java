package pharmacy;


// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:        Patient class - extends Person, holds medications and prescriptions
// Time Allocated: 2 weeks



// this extends Person meaning that Patient will inherit all of Persons attributres , id name etc

    public class Patient extends Person {

    public Patient(int id, String name, int age, String phoneNumber) {

        super(id, name, age, phoneNumber);

    }

    public String toString(){
        return super.toString();



    }
}


//super sends to parent to store as child cannot store it


// getters for medicaiton and perscription will go here
// remember to return medication and perscriptiuon





// setters will be below
//same thing but using .this
//and return nothing .. void




// rememver to print out returning super