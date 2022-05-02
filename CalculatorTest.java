import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
    @Test
    public void calculateTest() {
        assertEquals(Calculator.calculate(1,1),2);
        assertEquals(Calculator.calculate(3,0),3);
    }
}
