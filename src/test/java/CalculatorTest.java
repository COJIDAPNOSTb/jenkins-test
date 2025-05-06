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
    @Test
    public void goodTest()
    {
       int result = calculator.minus(5,1);
       assertEquals(4,result);
    }
    @Test
    public void BadTest()
    {
        int result = calculator.minus(15,2);
        assertEquals(-1,result);
    }

}
