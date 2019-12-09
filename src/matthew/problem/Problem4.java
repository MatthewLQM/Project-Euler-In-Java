package matthew.problem;

/**
 * Project Euler in Java
 * @author MatthewLQM
 *
 * matthew.Problem 4 Largest palindrome product
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
public class Problem4 {
    public static void main(String[] argv) {
        int max = 12321;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                String result = String.valueOf(i * j);
                char[] chars = result.toCharArray();
                int k;
                for(k = 0; k < chars.length / 2; k++) {
                    if(chars[k] != chars[chars.length - 1 -k]) break;
                }
                if(k >= chars.length / 2) max = Math.max(i * j, max);
            }
        }
        System.out.println("The result is " + max);
    }
}
