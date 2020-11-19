import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter your number want:");
        number = scanner.nextInt();

        int count=0;

        for (int i =2;count <number;i++){
            if (i == 2) System.out.println(i);
            else {
                for (int j=2;j<Math.sqrt(i);j++){
                    if (i%j==0){
                        continue;
                    }
                    System.out.println(i);
                    count ++;
                }
            }
        }
    }
}
