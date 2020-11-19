import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter number a:");
        a =scanner.nextInt();
        System.out.print("Enter number b:");
        b =scanner.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if (a == 0 || b == 0){
            System.out.print("No greatest common factor");
        } else {
            while (a != b){
                if (a >b){
                    a = a - b;
                } else b = b - a;
            }
            System.out.print("Greatest common factor: " + a);
        }


    }
}
