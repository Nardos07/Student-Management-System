package service;

import model.Student;
import repository.ObjectFileHandler;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students;
    private ObjectFileHandler fileHandler = new ObjectFileHandler();


    public StudentService(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
        fileHandler.saveObjects(students);
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // =========================
    // ✏️ UPDATE
    // =========================
    public void updateStudent(int id, String name, String dept, double gpa) {
        Student s = searchStudent(id);

        if (s != null) {
            s.setName(name);
            s.setDepartment(dept);
            s.setGpa(gpa);
            fileHandler.saveObjects(students);
        }
    }

    public void deleteStudent(int id) {
        Student s = searchStudent(id);

        if (s != null) {
            students.remove(s);
            fileHandler.saveObjects(students);
        }
    }


    public ArrayList<Student> getAllStudents() {
        return students;
    }
}