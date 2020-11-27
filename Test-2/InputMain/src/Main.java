import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        System.out.println("Enter your choice:");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    System.out.println("");
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 9; i++) {
                    System.out.print(i == 4 ? "*" : " ");
                }
                System.out.println("");
                for (int i = 0; i < 9; i++) {
                    System.out.print(i == 3 || i == 5 ? "*" : " ");
                }
                System.out.println("");
                for (int i = 0; i < 9; i++) {
                    System.out.print(i % 2 == 0 && i != 0 ? "*" : " ");
                }
                System.out.println("");
                for (int i = 0; i < 9; i++) {
                    System.out.print(i % 2 != 0 ? "*" : " ");
                }
                System.out.println("");
                for (int i = 0; i < 9; i++) {
                    System.out.print(i % 2 == 0 ? "*" : " ");
                }
                break;
            case 4:
                System.out.println("Exit");
        }
    }
}
