public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 6, 2, 61, 6, 3, 67, 7};


        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int value : arr) {
            System.out.print(value + ",");
        }
    }
}
