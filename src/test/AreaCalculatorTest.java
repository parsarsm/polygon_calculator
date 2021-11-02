package test;

import main.AreaCalculator;
import main.Rectangle;
import main.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
    @Test
    void testCalcArea() {
        Rectangle rectangle = new Rectangle(3, 5.5f);
        float area = (new AreaCalculator()).calculate(rectangle);

        Assertions.assertEquals(16.5, area);
    }

    @Test
    void testCalcAreaAndCalcForChanged() {
        Rectangle rectangle = new Rectangle(10, 1.5f);
        float area1 = (new AreaCalculator()).calculate(rectangle);

        rectangle.setHeight(3).setWidth(4);
        float area2 = (new AreaCalculator()).calculate(rectangle);

        Assertions.assertEquals(15, area1);
        Assertions.assertEquals(12, area2);
    }

    @Test
    void testCalcAreaForSquare() {
        Square square = new Square(3);
        float area = (new AreaCalculator()).calculate(square);

        Assertions.assertEquals(9, area);
    }
}
