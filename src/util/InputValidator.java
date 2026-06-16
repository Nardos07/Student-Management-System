package util;

import java.util.Scanner;

public class InputValidator {


    public int readInt(Scanner scanner) {

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again:");
            }
        }
    }


    public double readDouble(Scanner scanner) {

        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again:");
            }
        }
    }
}
