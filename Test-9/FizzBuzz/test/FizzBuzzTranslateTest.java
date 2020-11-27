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
}