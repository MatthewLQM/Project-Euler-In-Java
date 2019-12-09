package matthew.problem;

import matthew.Problem;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * matthew.Problem 21 Amicable numbers
 * https://projecteuler.net/problem=21
 */
public class Problem21 implements Problem {

    private int max = 10000;
    @Override
    public int solve() {
        int result = 0;
        int[] array = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            array[i] = sumOfProperDivisors(i);
        }
        for (int i = 1; i < max; i++) {
            int right = array[i];
            if(right <= max && i == array[right] && right != i) {
                result = result + i + right;
            }
        }
        return result / 2;
    }

    private int sumOfProperDivisors(int n) {
        int result = 1;
        Long upper = Math.round(Math.sqrt(n));
        for (int i = 2; i <= upper; i++) {
            int divisor = n / i;
            if (divisor * i == n) {
                if (divisor == i) {
                    result += i;
                } else {
                    result += i;
                    result += divisor;
                }
            }
        }
        return result;
    }

}
