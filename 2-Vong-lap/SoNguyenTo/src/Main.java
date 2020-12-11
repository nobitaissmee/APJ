import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner  = new Scanner(System.in);
        int number;
        System.out.print("Enter your number:");
        number = scanner.nextInt();

        if (number <2){
            System.out.println(number + "not is prime");
        } else {
            int i =2;
            boolean check =true;
            while (i <=Math.sqrt(number)){
                if (number %i == 0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " is prime");
            } else System.out.println(number + "is not prime12");
        }
    }
}
