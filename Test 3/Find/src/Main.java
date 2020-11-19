import java.io.OptionalDataException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i] == input_name) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                break;
            }
        }
        System.out.println("404 Not Found");
    }
}
