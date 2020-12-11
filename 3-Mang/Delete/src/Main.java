import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {10, 4, 6, 6, 8, 6, 8, 9, 10};
        int input;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Element in array:", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.print("Enter input:");
        input = scanner.nextInt();

        int[] array=del(arr,input);

        System.out.printf("Element in array:","\n");
        for (int j=0;j<array.length;j++) {
            System.out.print(array[j] + "\t");
        }

    }

    static int [] del(int[] arr,int input) {
        for (int i = 0; i < arr.length; i++) {
            while (input == arr[i]) {
                for (int j = i;j<arr.length-1;j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        return arr;
    }
}
