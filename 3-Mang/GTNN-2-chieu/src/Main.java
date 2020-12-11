import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] arr = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Index" + i +"-" + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (min >arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Min is :" + min);
    }
}
