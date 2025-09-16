import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldCalculatePercentages() {
        String expected = "30%";
        String actual = Calculator.percentage(3, 10);
        assertEquals(expected, actual);
    }

}