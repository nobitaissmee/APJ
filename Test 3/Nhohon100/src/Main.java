public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
//    check isPrime
    static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                //16 % 3
                return false;
            }
        }
        return true;
    }
}
