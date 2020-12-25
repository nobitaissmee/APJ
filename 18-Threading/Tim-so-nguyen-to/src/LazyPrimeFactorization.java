public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        for (int i=100;i<120;i++){
            if (isPrime(i)) System.out.println(i);
        }
    }

    public boolean isPrime(int value){
        if (value <2) return false;
        for (int i=2;i<value;i++){
            if (value %2==i) return false;
        }
        return true;
    }
}
