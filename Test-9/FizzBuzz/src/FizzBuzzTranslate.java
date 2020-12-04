public class FizzBuzzTranslate {

    private static final String[] NUMBER={"","mot","hai","ba","bon","nam","sau","bay","tam","chin"};

    public static final String FIZZ="Fizz";
    public static final String BUZZ="Buzz";
    public static final String FB="FizzBuzz";

    public static String checkNumber(int number) {
        if (number % 3 == 0 &&  number % 5 ==0) return FB;
        if (number % 3 ==0) return FIZZ;
        if (number % 5 == 0) return BUZZ;
        return readNumber(number);
    }

    private static String readNumber(int num){
        int tens=num/10;
        int ones=num%10;
        return ((tens==1? "Muoi":NUMBER[tens]) + " " +NUMBER[ones]);
    }

}
