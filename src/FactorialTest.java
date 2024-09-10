import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        FactorialOfANumber Factorial = new FactorialOfANumber();
        assertEquals(Factorial.factorial(0), 1);
        assertEquals(Factorial.factorial(1), 1);
        assertEquals(Factorial.factorial(2), 2);
        assertEquals(Factorial.factorial(3), 6);
        assertEquals(Factorial.factorial(4), 24);
        assertEquals(Factorial.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialOfANumber Factorial = new FactorialOfANumber();
        Factorial.factorial(-1);
    }
}