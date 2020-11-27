public class Main {

    public static void main(String[] args) {
        // write your code here
        StopWatch watch = new StopWatch();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() % 1000);
        }

        watch.start();
        SelectionSort.sortAscending(numbers);
        watch.stop();

        System.out.println("Elapsed time: " + watch.getElapsedTime() + "ms");
    }
}

