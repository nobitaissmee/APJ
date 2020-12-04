import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m=scanner.nextLine();
        char[] input= m.toCharArray();

        char[] charResult = new char[input.length];
        int[] count = new int[input.length];
        int index = 0;

        charResult[0] = input[0];
        count[0] = 1;

        for (int i = 1; i < input.length; i++) {
            if (charResult[index] == input[i]) {
                count[index]++;
            } else {
                charResult[++index] = input[i];
                count[index] = 1;
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.print(charResult[i]  + ""+ count[i]);
        }
    }
}