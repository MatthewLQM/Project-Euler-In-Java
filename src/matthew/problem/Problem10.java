package matthew.problem;

import matthew.Tools;

/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * matthew.Problem 10 Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] argv) {
        long result = 2L;
        for(long i = 3L; i < 2000000; i += 2) {
            if(Tools.isPrime(i)) result += i;
        }
        System.out.println("The result is " + result);
    }
}
