package Medication;

// Team:           Justin Seaward, Christopher Britten
// Date:           February 20, 2026
// Description:    Pharmacy midterm semester 3
// Details:        Person class is the base class for both patient and doctor, its holding shared info that each person has in the system
//ID,Name,Age, Phonenumber- both Patient and doctor both extend this.
// Time Allocated: 2 weeks

//imports here



public class Person {

    // Person will have id ,name and age along with phone num

    private int id;
    private String name;
    private int age;
    private String phoneNumber;


// here is the constructor ..it is parameterized


    // when the variable getts called the constructor will assign the variable to the object created
    public Person(int id, String name, int age, String phoneNumber) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;


    }

    //Getters here .. part of using encapsulation is using getter to access the private variables

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;


    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    // setters will change the private varibale when it is outside of the class

    public void setName(String name) {

        this.name = name;
    }

    // extra setters for tracking class requirment here

    // added medication tracking so more setters are needed such as setAge and setNewPhone

    public void setAge(int age) {
        this.age =age;

}

    public void setNewPhone(String phone) {
        this.phoneNumber = phone;
    }

    // printing out


    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Age: " + age + "Phone Number: " + phoneNumber;
    }
}


