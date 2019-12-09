package matthew.problem;

import matthew.Problem;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * matthew.Problem 1 Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 implements Problem {
    public int solve() {
        int result = 0;
        for (int i = 1; i * 3 < 1000; i++) {
            if (i % 5 == 0) continue;
            result += 3 * i;
        }
        for (int i = 1; i * 5 < 1000; i++) {
            result += 5 * i;
        }
        return result;
    }
}
