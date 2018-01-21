/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * Problem 9 Special Pythagorean triplet
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
    public static void main(String[] argv) {
        int a, b, c;
        for(c = 500; c > 333; c--) {
            for(b = c - 1, a = 1000 - c - b; b > a; b--, a++) {
                if(a*a + b*b == c*c) {
                    System.out.println("The result is " + a*b*c + "a, b, c is " + a + " " + b + " " + c);
                }
            }
        }
    }
}
