import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double C;
        double F;
        int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    F = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + CtoF(F));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    C = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + FtoC(C));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    static double CtoF (double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    static double FtoC (double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }


}
