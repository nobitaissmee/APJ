import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        String result = "Something";
        char test;

        System.out.println("Enter the char:");
        test = scanner.next().charAt(0);

        int count = 0;

        for (char index: result.toCharArray()) {
            if (index == test) {
                count ++;
            }
        }
        System.out.println(count);
        }
    }
