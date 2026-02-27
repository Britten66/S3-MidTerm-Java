# Pharmacy Management System




**Course:** Semester 3 - Java Object-Oriented Programming  
**Project Type:** Midterm Team Project  
**Duration:** February 20 - March 6, 2026  
**Team Size:** 2 


A Java-based console application developed to manage core pharmacy operations including patient records, doctor information, medication inventory, and prescription tracking.
This system demonstrates foundational Object-Oriented Programming (OOP) principles including inheritance, encapsulation, and class relationships.


## Features

### Patient Management
- **Add New Patients** - Register patients with ID, name, age, and phone number
- **Edit Patient Details** - Update patient information as needed
- **Delete Patients** - Remove patient records from the system
- **Search Patients by Name** - Quickly locate patient records and display complete profiles
- **View Patient Prescriptions** - Display all active prescriptions and medications for a patient

### Doctor Management
- **Add New Doctors** - Register doctors with specialization and contact information
- **Edit Doctor Details** - Update doctor credentials and information
- **Delete Doctors** - Remove doctor records from the system
- **Search Doctors by Name** - Find doctors and view their patient lists
- **Assign Patients to Doctors** - Link patients to their managing physicians

### Medication Management
- **Add New Medications** - Register medications with ID, name, dosage, quantity, and expiry date
- **Edit Medication Details** - Update medication information and stock levels
- **Delete Medications** - Remove discontinued medications from inventory
- **Search Medications by Name** - Locate specific drugs and view complete details
- **Restock Medications** - Replenish pharmacy inventory to specified levels
- **Expired Medication Tracking** - Automatic detection of expired medications

### Prescription & Tracking System
- **Accept Prescriptions** - Manually input prescriptions linking doctors, patients, and medications
- **Generate System Report** - Comprehensive report of all patients, doctors, and medications
- **Generate Expired Medication Report** - Display all expired medications with full details
- **Generate Doctor Prescription Report** - View all prescriptions issued by a specific doctor
- **Generate Patient Annual Report** - Summarize all prescriptions for a patient over the past year

## System Architecture

The application follows oop design principles with a clear inheritance hierarchy

### Class Structure

**`Person` (Base Class)**
- Shared attributes: `id`, `name`, `age`, `phoneNumber`
- Provides foundational methods for all people in the system
- Implements proper encapsulation with getters/setters

**`Patient` (extends Person)**
- Maintains lists of active `medications` and `prescriptions`
- Tracks complete medical profile for pharmacy operations

**`Doctor` (extends Person)**
- Includes `specialization` field
- Maintains list of managed `patients`

**`Medication`**
- Represents pharmacy inventory items
- Attributes: `id`, `name`, `dose`, `quantityInStock`, `expiryDate`
- Expiry dates include historical dates for testing expired medication detection

**`Prescription`**
- Links `Doctor`, `Patient`, and `Medication` objects
- Includes prescription ID and expiry date (defaults to one year from issue)

**`MedicationTrackingSystem`**
- Central controller managing all system operations
- Maintains master lists of patients, doctors, and medications
- Implements all CRUD operations and reporting functionality
- Provides interactive console menu interface

## Getting Started

### Prerequisites
- Java Development Kit 17 or higher
- IntelliJ IDEA or other IDE
- Git 

### Installation & Setup

1. **Clone the repository:**
```bash
   git clone https://github.com/your-username/pharmacy-management-system.git
   cd pharmacy-management-system
```

2. **Open in IntelliJ IDEA:**
   - File. Open.  Select project directory
   - Wait for IDE to index the project

3. **Build the project:**
   - Build Project (Ctrl+F9)
   - Ensure all dependencies resolve correctly

4. **Run the application:**
   - Navigate to `MedicationTrackingSystem.java`
   - Run 'MedicationTrackingSystem.main()'
   - Follow the interactive console menu

## Usage

### Running the System

The system provides an interactive console menu for all operations:
```
=== Pharmacy Management System ===
1. Add Patient
2. Add Doctor
3. Add Medication
4. Search Patient
5. Search Doctor
6. Search Medication
7. Edit Patient
8. Edit Doctor
9. Edit Medication
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
0. Exit
```

### Example Operations

**Adding a Patient:**
```java
Patient patient = new Patient("P001", "John Doe", 45, "555-1234");
```

**Creating a Prescription:**
```java
Prescription rx = new Prescription("RX001", doctor, patient, medication);
```

**Searching by Name:**
Select the search option from menu and enter the name to locate records instantly.

## Project Structure
```
pharmacy-management-system/
│
├── src/
│   └── pharmacy/
│       ├── Person.java                    # Base class for Patient and Doctor
│       ├── Patient.java                   # Patient entity (extends Person)
│       ├── Doctor.java                    # Doctor entity (extends Person)
│       ├── Medication.java                # Medication inventory management
│       ├── Prescription.java              # Prescription linking entity
│       ├── MedicationTrackingSystem.java  # Main system controller with menu
│       └── PeopleDemo.java                # Testing and demonstration class
│
├── .gitignore                             # Git ignore file (IDE configs, builds)
├── README.md                              # Project documentation
└── docs/
    ├── UserDocumentation.md               # User guide and class explanations
    ├── DevelopmentDocumentation.md        # Technical specs and build process
    └── ClassDiagram.png                   # UML class diagram
```

### Package Organization
- **`pharmacy`** - Main package containing all system classes
  - People-related classes: `Person`, `Patient`, `Doctor`
  - Medication-related classes: `Medication`, `Prescription`
  - System management: `MedicationTrackingSystem`
  - Testing utilities: `PeopleDemo`



### Git Workflow

**Branching Strategy:**
- `main` - Production-ready code
- `feature/people-classes` - Chris's development branch
- `feature/medication-classes` - Justin's development branch

**Collaboration Process:**
1. Feature development on dedicated branches
2. Regular commits with  messages
3. Pull Requests for code review before merging
4. Integration testing after merges
5. Consistent communication about shared `MedicationTrackingSystem` class


## Technologies Used

- **Java 17** - Core programming language
- **IntelliJ IDEA** - Primary IDE for development
- **Git/GitHub** - Version control and collaboration
- **Java Standard Library** - Collections framework (ArrayList), utilities
- **Scanner Class** - Console input for interactive menu system





### Learning Objectives Demonstrated
- Object-Oriented Programming principles (inheritance, encapsulation, polymorphism)
- Collaborative software development using Git
- Clean code practices and proper documentation
- Class relationship design and implementation
- Version control workflow with branching and pull requests
- Software testing and validation

