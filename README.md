# 📘 Student Record Management System (Java OOP + File I/O)

## 📌 Project Description

This project is a **Student Record Management System** developed using **Java Object-Oriented Programming (OOP)** and **File Input/Output (File I/O)** concepts.

The system allows users to manage student information efficiently using **CRUD operations (Create, Read, Update, Delete)** and stores data using multiple file handling techniques including **text files, binary files, and object serialization**.

It also includes a **report generation module**, **backup system**, and **file management utilities** using Java `File` class, demonstrating real-world software design principles.

---

## 🎯 Objectives

- Apply Object-Oriented Programming principles in Java  
- Practice file handling using multiple approaches  
- Implement real-world CRUD system logic  
- Generate statistical reports from data  
- Learn backup and file management techniques  
- Handle exceptions properly for robust system design  

---

## ⚙️ Features

### 👨‍🎓 Student Management
- Add new student  
- Search student by ID  
- Update student details  
- Delete student record  
- Display all students  

---

### 💾 File Storage Systems

#### 📄 Text File Storage
- Uses `Scanner` and `PrintWriter`

#### 🧾 Binary File Storage
- Uses `DataInputStream` and `DataOutputStream`

#### 📦 Object Serialization
- Uses `ObjectInputStream` and `ObjectOutputStream`

---

### 📊 Report Generation
- Total number of students  
- Student with highest GPA  
- Student with lowest GPA  
- Average GPA calculation  

---

### 🛠 File Management Features
- Automatic creation of required folders/files using `File` class  
- Display file properties:
  - File name  
  - File path  
  - File size  
  - Last modified date  

---

### 💿 Backup System
- Creates backup copies of student records  
- Uses Buffered Streams for efficient file copying  

---

### ⚠️ Exception Handling
- Handles file-related errors  
- Handles invalid user input  
- Prevents system crashes using proper exception management  

---

## 🧠 Technologies & Concepts Used

- Java OOP (Classes, Objects, Encapsulation)  
- File I/O Streams  
- Buffered Streams  
- Serialization  
- Exception Handling  
- Data Structures (Lists/Arrays)  
- Modular Programming  

---

## 📁 Project Structure
StudentRecordSystem/
│
├── src/
│ ├── model/
│ ├── service/
│ ├── repository/
│ ├── report/
│ ├── util/
│ └── Main.java
│
├── data/
│ ├── students.txt
│ ├── students.dat
│ └── students.ser
│
├── backup/
│
├── docs/
│
└── README.md


---

## 🚀 Future Improvements

- Add GUI using JavaFX or Swing  
- Add database support (MySQL/PostgreSQL)  
- Add login/authentication system  
- Add role-based access (Admin/Student)  
- Export reports to PDF/Excel  

---

## 📌 Author

Developed as a learning project for mastering **Java OOP + File Handling concepts**.
