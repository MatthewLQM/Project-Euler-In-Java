/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * Problem 6 Sum square difference
 * The sum of the squares of the first ten natural numbers is,
 *     12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *     (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 *
 */
public class Problem6 {
    public static void main(String[] argv) {
        int number = 100;
        int result = 0;
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j < i; j++) {
                result += 2 * i * j;
            }
        }
        System.out.println("The result is " + result);
    }
}
