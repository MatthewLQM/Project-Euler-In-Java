/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * Problem 5 Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */
public class Problem5 {
    public static void main(String[] argv) {
        // I solve this question totally by math knowledge without programming;
        // My idea is that if the number can be divided by both 3 and 5, then this number
        // can be divided by 15 too, and so on.
        int result = 3 * 5 * 7 * 3 * 11 * 13 * 16 * 17 * 19;
        System.out.println("The result is " + result);
    }
}
