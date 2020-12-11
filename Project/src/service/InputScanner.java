package service;

import java.util.Scanner;

public class InputScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public static double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    public static String getString() {
        return scanner.nextLine();
    }
}
