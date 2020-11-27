import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
        System.out.println("Enter number c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();

        System.out.println("Delta:" + delta);

        if (delta > 0) {
            System.out.println("N1:" + quadraticEquation.getRoot1());
            System.out.println("N2:" + quadraticEquation.getRoot2());
        }
        if (delta == 0) {
            System.out.println("N:" + quadraticEquation.getRoot1());
        }
        if (delta <0) {
            System.out.println("The equation has no roots");
        }
    }

}
