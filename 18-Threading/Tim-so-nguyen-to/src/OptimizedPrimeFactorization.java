public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        for (int i=100;i<120;i++){
            if (isPrime(i)) System.out.println(i);
        }
    }
    public boolean isPrime(int value){
        if (value <2 ) return false;
        for (int i=2;i<Math.sqrt(value);i++){
            if (value %i==0) return false;
        }
        return true;
    }
}
