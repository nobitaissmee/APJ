public class Main {
    public static void main(String[] args) {
        OddThread newOdd=new OddThread();
        EvenThread newEven=new EvenThread();

        Thread oddThread=new Thread(newOdd);
        Thread evenThread=new Thread(newEven);

        try{
            oddThread.start();
            oddThread.join();
            evenThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
