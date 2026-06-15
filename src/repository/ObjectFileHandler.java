package repository;

import model.Student;
import java.io.*;
import java.util.ArrayList;

public class ObjectFileHandler {

    private String filePath = "data/students.ser";


    public void saveObjects(ArrayList<Student> students) {

        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(file));

            out.writeObject(students);

            out.close();
            System.out.println("Objects saved successfully (Serialization)!");

        } catch (IOException e) {
            System.out.println("Error saving objects: " + e.getMessage());
        }
    }


    public ArrayList<Student> loadObjects() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                return students;
            }

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(file));

            students = (ArrayList<Student>) in.readObject();

            in.close();

        } catch (Exception e) {
            System.out.println("Error loading objects: " + e.getMessage());
        }

        return students;
    }
}