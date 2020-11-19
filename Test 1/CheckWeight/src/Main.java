import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        double weight,height,bmi;

        System.out.print("Enter weight:");
        weight =scanner.nextDouble();
        System.out.print("Enter height:");
        height=scanner.nextDouble();
        bmi=weight/(height*height);

        if (bmi >= 30.0){
            System.out.print("Obese");
        } else if (bmi >=25.0){
            System.out.print("Overweight");
        } else if (bmi >=18.5){
            System.out.print("Normal");
        } else System.out.print("Underweight");
    }
}
