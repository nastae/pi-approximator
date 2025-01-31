package algorithms;

import com.pi.approximator.algorithms.PiCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiCalculatorTest {

    @Test
    public void testPiCalculationWithTenDecimalPlaces() {
        double calculatedPi = PiCalculator.calculatePi(10, 2147483647);
        assertEquals(3.1415926535, calculatedPi);
    }
}
