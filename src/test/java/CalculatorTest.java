import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suheng on 8/5/15.
 */
public class CalculatorTest {
    @Test
    public void testEvaluatesExpression() throws Exception {
        Calculator c = new Calculator();
        int sum = c.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
