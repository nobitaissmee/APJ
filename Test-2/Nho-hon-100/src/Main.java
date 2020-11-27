public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i =0;i <= 100 ;i++){
            if (checkNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkNumber(int number) {
        if (number <2) return false;
        for (int i=2;i <=Math.sqrt(number);i++) {
            if (number %i == 0) {
                return false;
            }
        }
        return true;
    }
}
