import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int money;
        double amount;
        int month;
        System.out.print("Enter your money:");
        money =scanner.nextInt();
        System.out.print("Enter your amount:");
        amount =scanner.nextDouble();
        System.out.print("Enter your month");
        month =scanner.nextInt();

        double moneyOut = 0;

        for (int i=0;i<month;i++) {

            moneyOut += money * (amount / 100)/12 * month;


        }
        System.out.print("Out:" + moneyOut);
    }
}
