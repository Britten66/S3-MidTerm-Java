# Pharmacy Management System

**Project Type:** Midterm Team Project  
**Duration:** February 20 - March 6, 2026  
**Team Size:** 2

A Java-based console application managing core pharmacy operations including patient records, doctor information, medication inventory, and prescription tracking. Demonstrates OOP principles including inheritance, encapsulation, and class relationships.

---

## Features

### Patient Management
- Add, edit, delete, and search patients
- View all active prescriptions and medications per patient

### Doctor Management
- Add, edit, delete, and search doctors
- Assign patients to managing physicians

### Medication Management
- Add, edit, delete, and search medications
- Restock inventory and track expiry dates

### Prescription & Reporting
- Accept prescriptions linking doctor, patient, and medication
- Generate full system report
- Generate expired medication report
- Generate doctor prescription report
- Generate patient annual prescription summary

---



### requirements
- Java 17+
- IntelliJ IDEA or equivalent IDE
- Git

### Installation

1. **Clone the repository:**
```bash
git clone [https://github.com/your-username/pharmacy-management-system.git](https://github.com/Britten66/S3-MidTerm-Java.git)
cd pharmacy-management-system
```

2. **Open in IntelliJ IDEA:**
   - File + Open + Select project directory

3. **Build:**
   - Ctrl+F9 or Build + Build Project

4. **Run:**
   - Navigate to `MedicationTrackingSystem.java`
   - Run `MedicationTrackingSystem.main()`

---

## User Guide Here 
```
=== Pharmacy Management System ===
1.  Add Patient
2.  Add Doctor
3.  Add Medication
4.  Search Patient
5.  Search Doctor
6.  Search Medication
7.  Edit Patient
8.  Edit Doctor
9.  Edit Medication
10. Delete Patient
11. Delete Doctor
12. Delete Medication
13. Assign Patient to Doctor
14. Accept Prescription
15. Generate System Report
16. Generate Expired Medication Report
17. Generate Doctor Prescription Report
18. Generate Patient Annual Report
19. Restock Medications
0.  Exit
```

---

## Project Layout
```
pharmacy-management-system/
│
├── src/
│   └── Medication/
│       ├── Person.java
│       ├── Patient.java
│       ├── Doctor.java
│       ├── Medication.java
│       ├── Prescription.java
│       ├── PrescriptionDemo.java      
│       ├── MedicationTrackingSystem.java
│       ├── PeopleDemo.java
|       ├── Main.java
│       └── SystemDemo.java
│
├── .gitignore
├── README.md
└── docs/
    ├── UserDocumentation.md
    ├── DevelopmentDocumentation.md
    └── ClassDiagram.png
```

---

## Git Workflow

**Branches:**
- `main` — production-ready code
- `development` - pre depolying enviroment 
- `feature/people-classes` — (Person, Patient, Doctor)
- `feature/medication-classes` —  (Medication, Prescription)

**Process:**
1. Feature development on dedicated branches
2. Regular commits with descriptive messages
3. Pull Requests reviewed before merging to main
4. Integration testing after each merge

---

## Technologies

- **Java 17** — Core language
- **IntelliJ IDEA** — IDE
- **Git/GitHub** — Version control
- **ArrayList** — Collections management
- **Scanner** — Console input handling
