package util;

public class ExceptionUtil {

    public static void handleException(Exception e) {

        System.out.println("\n========== ERROR ==========");

        System.out.println("Type: "
                + e.getClass().getSimpleName());

        System.out.println("Message: "
                + e.getMessage());

        System.out.println("===========================\n");
    }
}