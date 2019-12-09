package matthew.problem;

import matthew.Tools;

/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * matthew.Problem 7 10001st prime
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 */
public class Problem7 {
    public static void main(String[] argv) {
        long count = 2, number = 3;
        while(count != 10001) {
            number += 2;
            if(Tools.isPrime(number)) count++;
        }
        System.out.println("The result is " + number);
    }
}
