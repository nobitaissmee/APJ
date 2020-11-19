import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ac=new Scanner(System.in);
        double a,b,c;
        System.out.print("a=");
        a=ac.nextDouble();
        System.out.print("b=");
        b=ac.nextDouble();

        if (a !=0){
            double solution= -b/a;
            System.out.printf("The solution is:%f!",solution);
        } else {
            if (b ==0 ){
                System.out.print("All x ");
            } else {
                System.out.print("No");
            }
        }

    }
}
