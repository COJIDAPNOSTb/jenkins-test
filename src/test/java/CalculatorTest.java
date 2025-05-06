import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd()
    {
        int result = calculator.add(1,2);
        assertEquals(3,result);
    }

}
