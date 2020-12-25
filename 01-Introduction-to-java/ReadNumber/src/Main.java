import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter your number:");
        number=scanner.nextInt();
        if (number <10 && number >= 0){
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                    case 10:
                        System.out.println("Ten");
                default:
                    System.out.println("Out Of Ability");
            }
        } else if (number <20 && number >10){
            switch (number-10){
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
//                default:
//                    System.out.println("Out Of Ability");
            }
        } else if (number >=20 && number <100){
            switch (number/10) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch(number%10){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
}
