package report;

import model.Student;
import java.util.ArrayList;

public class StudentReport {

    public int getTotalStudents(ArrayList<Student> students) {
        return students.size();
    }

    public Student getHighestGPAStudent(ArrayList<Student> students) {

        if (students.isEmpty()) {
            return null;
        }

        Student highest = students.get(0);

        for (Student s : students) {
            if (s.getGpa() > highest.getGpa()) {
                highest = s;
            }
        }

        return highest;
    }

    public Student getLowestGPAStudent(ArrayList<Student> students) {

        if (students.isEmpty()) {
            return null;
        }

        Student lowest = students.get(0);

        for (Student s : students) {
            if (s.getGpa() < lowest.getGpa()) {
                lowest = s;
            }
        }

        return lowest;
    }

    public double getAverageGPA(ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student s : students) {
            total += s.getGpa();
        }

        return total / students.size();
    }
}