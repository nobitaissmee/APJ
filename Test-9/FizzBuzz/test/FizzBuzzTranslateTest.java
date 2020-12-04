import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    @DisplayName("Testing 3")
    void checkNumber3() {
        int input =3;
        String expected ="Fizz";

        String result = FizzBuzzTranslate.checkNumber(input);

        assertEquals (result, expected);
    }

    @Test
    @DisplayName("Testing 26")
    void checkNumber26() {
        int input=26;
        String expected="hai sau";

        String result = FizzBuzzTranslate.checkNumber(input);

        assertEquals (result, expected);
    }
}