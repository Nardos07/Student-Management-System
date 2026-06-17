# Student Record Management System

## Project Overview

The Student Record Management System is a Java-based application developed using Object-Oriented Programming (OOP) principles and Java File I/O techniques.

The system allows users to manage student records through CRUD operations (Create, Read, Update, Delete) and demonstrates multiple file handling approaches including Text Files, Binary Files, and Object Serialization.

The project also includes report generation, file management utilities, backup functionality using Buffered Streams, and exception handling mechanisms.

---

## Objectives

* Apply Java OOP concepts in a real-world project.
* Implement CRUD operations for student management.
* Practice Java File I/O using multiple storage techniques.
* Generate reports based on stored student data.
* Implement backup and recovery support.
* Demonstrate proper exception handling and software organization.

---

## Features

### Student Management

* Add Student
* Search Student by ID
* Update Student Information
* Delete Student Record
* Display All Students

### File Storage Methods

* Text File Storage (`Scanner`, `PrintWriter`)
* Binary File Storage (`DataInputStream`, `DataOutputStream`)
* Object Serialization (`ObjectInputStream`, `ObjectOutputStream`)

### Report Generation

* Total Students
* Highest GPA Student
* Lowest GPA Student
* Average GPA Calculation

### File Utilities

* Create Directories Automatically
* Create Files Automatically
* Display File Name
* Display File Path
* Display File Size
* Display Last Modified Date

### Backup System

* Backup Student Records
* Buffered Streams Implementation
* Automatic Backup Directory Creation

### Exception Handling

* Invalid Number Handling
* Invalid GPA Handling
* File Error Handling
* Centralized Exception Reporting

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList)
* Java File I/O
* Serialization
* Buffered Streams
* Exception Handling
* Git & GitHub

---

## Project Structure

src/
│
├── model/
│ └── Student.java
│
├── service/
│ └── StudentService.java
│
├── repository/
│ ├── TextFileHandler.java
│ ├── BinaryFileHandler.java
│ └── ObjectFileHandler.java
│
├── report/
│ └── StudentReport.java
│
├── util/
│ ├── FileUtil.java
│ ├── BackupUtil.java
│ ├── ExceptionUtil.java
│ └── InputValidator.java
│
└── Main.java

Project Structure

data/
└── students.ser

README.md

---

## OOP Concepts Applied

### Encapsulation

The Student class uses private fields with public getters and setters.

### Objects and Classes

Student objects are created and managed throughout the system.

### Modular Design

The project separates responsibilities into packages:

* model
* service
* repository
* report
* util

### Separation of Concerns

Each class has a specific responsibility:

* Student → Data Model
* StudentService → Business Logic
* Repository Classes → File Storage
* StudentReport → Analytics
* Utility Classes → Support Functions

---

## How the System Works

### Startup Process

1. Application starts.
2. Existing student records are loaded from `students.ser`.
3. StudentService receives loaded data.
4. Menu system becomes available.

### CRUD Flow

User Action
↓
StudentService
↓
ArrayList<Student>
↓
ObjectFileHandler
↓
students.ser

### Reporting Flow

StudentService
↓
StudentReport
↓
Statistics Output

### Backup Flow

Student Records
↓
Buffered Streams
↓
Backup File

---

## How to Run

### Requirements

* Java JDK 8 or higher
* IntelliJ IDEA, Eclipse, or NetBeans

### Steps

1. Clone the repository:

git clone your repo link 

2. Open the project in your IDE.

3. Ensure the following folders exist:

* data/
* backup/

4. Run:

Main.java

5. Use the menu to manage student records.

---

## Sample Test Cases

### Add Student

ID: 101
Name: John
Department: CS
GPA: 3.8

Expected:
Student added successfully.

### Search Student

Search:
101

Expected:
Student information displayed.

### Report Generation

Expected:

* Total Students
* Highest GPA
* Lowest GPA
* Average GPA

---

## Learning Outcomes

Through this project, the following concepts were practiced:

* Java OOP Design
* CRUD Operations
* Java Collections
* File Handling
* Binary Storage
* Object Serialization
* Buffered Streams
* Exception Handling
* Software Architecture
* Git and GitHub Workflow

## Author
Nardos Demewez 

Student Record Management System

Java OOP + File I/O Project

Academic Submission – June 2026

