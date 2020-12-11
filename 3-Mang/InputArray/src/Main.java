import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr;
        int size;
        int index;
        int input;
        int temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size:");
        size = scanner.nextInt();

        arr = new int[size];
        int i = 0;

        while (i < arr.length) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Arr:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("Enter input");
        input = scanner.nextInt();

        do {
            System.out.println("Enter index:");
            index = scanner.nextInt();
            if (index < 0 || index > size) {
                System.out.println("404 Not Found");
            }
        } while (index < 0 || index > size);

        int prevValue = arr[index];
        int currentValue;
        arr[index] = input;
        for (int t = index + 1; t < size; t++) {
            currentValue = arr[t];
            arr[t] = prevValue;
            prevValue = currentValue;
        }

        System.out.print("Arr:");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
