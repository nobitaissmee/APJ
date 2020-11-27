public class FizzBuzzTranslate {

    public static final String FIZZ="Fizz";
    public static final String BUZZ="Buzz";
    public static final String FB="FizzBuzz";

    public static String checkNumber(int number) {
        if (number % 3 == 0 &&  number % 5 ==0) return FB;
        if (number % 3 ==0) return FIZZ;
        if (number % 5 == 0) return BUZZ;
        return String.valueOf(number);
    }

    
}
