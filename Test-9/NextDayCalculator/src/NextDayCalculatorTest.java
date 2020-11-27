import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Test 1/1/2018")
    void testGetNextDay112018() {
        String day ="1/1/2018";
        String expected="02/01/2018";

        String result=NextDayCalculator.getNextDay(day);

        assertEquals(result,expected);
    }

    @Test
    @DisplayName("Test 31/12/2019")
    void testGetNextDay31122019() {
        String day ="31/12/2019";
        String expected="01/01/2020";

        String result=NextDayCalculator.getNextDay(day);

        assertEquals(result,expected);
    }
}