public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("First Number: ");
        thread1.start();
        thread2.start();
    }
}
