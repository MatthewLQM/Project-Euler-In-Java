package matthew.problem;

import matthew.Tools;

/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * matthew.Problem 3 Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * hits : it's a brilliant idea to start with small number and find that whether
 * the big one is a prime number.
 */
public class Problem3 {
    public static void main(String[] argv) {
        Long targetNumber = 600851475143L;
        for(Long i = 2L; i < targetNumber; i++) {
            if(targetNumber % i == 0 && Tools.isPrime(targetNumber/i)) {
                System.out.println("The result is " + targetNumber/i);
                break;
            }
        }
    }

}
