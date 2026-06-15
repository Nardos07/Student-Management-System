package repository;

import model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileHandler {

    private String filePath = "data/students.txt";


    public void saveToFile(ArrayList<Student> students) {

        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();

            PrintWriter writer = new PrintWriter(new FileWriter(file));

            for (Student s : students) {
                writer.println(s.toString());
            }

            writer.close();
            System.out.println("Data saved to text file successfully!");

        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }


    public ArrayList<Student> loadFromFile() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                return students;
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double gpa = Double.parseDouble(data[3]);

                Student student = new Student(id, name, department, gpa);
                students.add(student);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        return students;
    }
}
