public class SelectionSort {

    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentMin = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < currentMin) {
                    currentMin = arr[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                arr[minIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
}
