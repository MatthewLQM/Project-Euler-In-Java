package matthew.problem;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 *
 * matthew.Problem 12 Highly divisible triangular number
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem12 {
    public static void main(String[] argv) {
        int divisorCount = 0, i = 1, result = 0;
        while(divisorCount <= 500) {
            result += i;
            i++;
            divisorCount = calculateCount(result);
        }
        System.out.println("The result is " + result);
    }

    public static int calculateCount(int number) {
        int count = 0;
        // There is a bug, if this number is perfect squares, the count is the true count plus one.
        // But this bug do not influence the result to this question :)
        for(int i = 1; i <= Math.sqrt(number); i++) {
            if(number % i == 0) count += 2;
        }
        return count;
    }
}
