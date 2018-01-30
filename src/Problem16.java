import java.math.BigInteger;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 *
 * Problem 16 Power digit sum
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
 */
public class Problem16 implements Problem {
    @Override
    public int solve() {
        int result = 0;
        BigInteger number = BigInteger.valueOf(2);
        number = number.pow(1000);
        while (number.compareTo(BigInteger.ZERO) == 1) {
            result += number.mod(BigInteger.TEN).intValue();
            number = number.divide(BigInteger.TEN);
        }
        return result;
    }
}
