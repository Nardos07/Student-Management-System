package service;

import model.Student;
import java.util.ArrayList;

//StudentService class on service package

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null; // not found
    }


    public void updateStudent(int id, String name, String department, double gpa) {
        Student s = searchStudent(id);

        if (s != null) {
            s.setName(name);
            s.setDepartment(department);
            s.setGpa(gpa);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void deleteStudent(int id) {
        Student s = searchStudent(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }


    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }


    public ArrayList<Student> getAllStudents() {
        return students;
    }
}