
public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization no=new LazyPrimeFactorization();
        OptimizedPrimeFactorization yes=new OptimizedPrimeFactorization();

        Thread noThread=new Thread(no);
        Thread yesThread=new Thread(yes);

        try{
            System.out.println("No: ");
            noThread.start();
            noThread.join();
            System.out.println("Yes: ");
            yesThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
