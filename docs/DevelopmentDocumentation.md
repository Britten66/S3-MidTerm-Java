
## Source Code Directory Structure

    src/
      Medication/
        Person.java                  
        Patient.java                 
        Doctor.java                   
        Medication.java               
        Prescription.java             
        MedicationTrackingSystem.java 
        PeopleDemo.java             
        PrescriptionDemo.java       
    docs/
        UserDocumentation.md
        DevelopmentDocumentation.md
        ClassDiagram.png

    .gitignore
    README.md
---------------------------------------------------------------


Compile via Command Line

javac -d out src/Medication/*.java
java -cp out Medication.Main

---------------------------------------------------------------
Development Standards:

Naming: camelCase for variables and methods, PascalCase for classes

Encapsulation: All class fields are private with public getters and setters

Comments: Inline comments explain logic throughout; class-level headers document purpose, author, and date

Null Safety: Null checks applied before object operations (e.g. addPatientToDoctor validates both IDs before linking)

Loop Pattern: Index-based for loops used for delete/update operations where .remove() on an object reference is not applicable from Scanner input

Fail Fast: Methods return immediately after a successful operation to avoid unnecessary iteration

---------------------------------------------------------------

Entity Relationship Summary

A Doctor manages many Patients (many-to-many via DoctorPatient)
A Patient can have many Prescriptions
A Prescription references exactly one Doctor, one Patient, and one Medication
A Medication can appear on many Prescriptions