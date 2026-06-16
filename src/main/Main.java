import model.Student;
import repository.ObjectFileHandler;
import service.StudentService;
import report.StudentReport;
import util.InputValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        ObjectFileHandler fileHandler = new ObjectFileHandler();
        ArrayList<Student> students = fileHandler.loadObjects();


        StudentService service = new StudentService(students);

        StudentReport report = new StudentReport();

        int choice;

        do {
            System.out.println("\n===== STUDENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All");
            System.out.println("6. Report");
            System.out.println("7. Exit");

            System.out.print("Choice: ");
            choice = validator.readInt(scanner);

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = validator.readInt(scanner);

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Department: ");
                    String dept = scanner.nextLine();

                    System.out.print("GPA: ");
                    double gpa = validator.readDouble(scanner);

                    service.addStudent(
                            new Student(id, name, dept, gpa)
                    );
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int searchId = validator.readInt(scanner);

                    Student found = service.searchStudent(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Not found");
                    break;

                case 3:
                    System.out.print("ID: ");
                    int uid = validator.readInt(scanner);

                    System.out.print("New Name: ");
                    String nname = scanner.nextLine();

                    System.out.print("New Dept: ");
                    String ndept = scanner.nextLine();

                    System.out.print("New GPA: ");
                    double ngpa = validator.readDouble(scanner);

                    service.updateStudent(uid, nname, ndept, ngpa);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int did = validator.readInt(scanner);
                    service.deleteStudent(did);
                    break;

                case 5:
                    for (Student s : service.getAllStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 6:
                    System.out.println("Total: " +
                            report.getTotalStudents(service.getAllStudents()));

                    System.out.println("Highest GPA: " +
                            report.getHighestGPAStudent(service.getAllStudents()));

                    System.out.println("Lowest GPA: " +
                            report.getLowestGPAStudent(service.getAllStudents()));

                    System.out.println("Average GPA: " +
                            report.getAverageGPA(service.getAllStudents()));
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        scanner.close();
    }
}