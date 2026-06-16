package util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileUtil {

    public void createDirectory(String path) {

        File directory = new File(path);

        if (!directory.exists()) {

            if (directory.mkdirs()) {
                System.out.println("Directory created: " + path);
            } else {
                System.out.println("Failed to create directory.");
            }

        } else {
            System.out.println("Directory already exists.");
        }
    }

    public void createFile(String path) {

        try {

            File file = new File(path);

            if (!file.exists()) {

                if (file.createNewFile()) {
                    System.out.println("File created: " + path);
                } else {
                    System.out.println("Could not create file.");
                }

            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public void displayFileProperties(String path) {

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        System.out.println("File Name: " + file.getName());

        System.out.println("File Path: "
                + file.getAbsolutePath());

        System.out.println("File Size: "
                + file.length() + " bytes");

        System.out.println("Last Modified: "
                + new Date(file.lastModified()));
    }
}
