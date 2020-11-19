import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        double vnd=23000;
        double usd;

        System.out.print("Enter your usd:");
        usd=scanner.nextDouble();

        double quydoi= usd*vnd;

        System.out.println("Result:" + quydoi);
    }
}
