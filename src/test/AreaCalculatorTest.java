package test;

import main.AreaCalculator;
import main.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
    @Test
    void testCalcArea() {
        Rectangle rectangle = new Rectangle(3, 5.5f);
        float area = (new AreaCalculator()).calculate(rectangle);

        Assertions.assertEquals(16.5, area);
    }
}
