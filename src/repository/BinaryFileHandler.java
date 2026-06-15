package repository;

import model.Student;
import java.io.*;
import java.util.ArrayList;

public class BinaryFileHandler {

    private String filePath = "data/students.dat";


    public void saveToBinary(ArrayList<Student> students) {

        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();

            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));

            for (Student s : students) {
                out.writeInt(s.getId());
                out.writeUTF(s.getName());
                out.writeUTF(s.getDepartment());
                out.writeDouble(s.getGpa());
            }

            out.close();
            System.out.println("Binary file saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving binary file: " + e.getMessage());
        }
    }


    public ArrayList<Student> loadFromBinary() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                return students;
            }

            DataInputStream in = new DataInputStream(new FileInputStream(file));

            while (in.available() > 0) {

                int id = in.readInt();
                String name = in.readUTF();
                String department = in.readUTF();
                double gpa = in.readDouble();

                Student student = new Student(id, name, department, gpa);
                students.add(student);
            }

            in.close();

        } catch (IOException e) {
            System.out.println("Error loading binary file: " + e.getMessage());
        }

        return students;
    }
}