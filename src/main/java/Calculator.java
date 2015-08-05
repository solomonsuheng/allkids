/**
 * Created by Suheng on 8/5/15.
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+")) {
            sum += Integer.valueOf(summand);
        }
        return sum;
    }
}
