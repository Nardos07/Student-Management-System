package util;

import java.io.*;

public class BackupUtil {

    public void backupFile(String sourcePath,
                           String destinationPath) {

        try {

            File sourceFile = new File(sourcePath);

            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            File destinationFile = new File(destinationPath);

            if (destinationFile.getParentFile() != null) {
                destinationFile.getParentFile().mkdirs();
            }

            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream(sourceFile));

            BufferedOutputStream bos =
                    new BufferedOutputStream(
                            new FileOutputStream(destinationFile));

            int data;

            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();

            System.out.println("Backup created successfully!");

        } catch (IOException e) {
            System.out.println("Backup error: "
                    + e.getMessage());
        }
    }
}