import java.math.BigDecimal;
/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * Problem 20 Counting Sundays
 * https://projecteuler.net/problem=19
 */
public class Problem20 implements Problem {

    @Override
    public int solve() {
        BigDecimal result = new BigDecimal(0);
        BigDecimal number = new BigDecimal(1);
        for(int i = 2; i <= 100; i++) {
            number = number.multiply(new BigDecimal(i));
        }
        while(number.compareTo(BigDecimal.ZERO) > 0) {
            result = result.add(number.remainder(BigDecimal.TEN));
            number = number.divideToIntegralValue(BigDecimal.TEN);
        }
        return result.intValue();
    }
}
