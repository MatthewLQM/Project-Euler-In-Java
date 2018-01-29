/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 *
 * Problem 14 Longest Collatz sequence
 * The following iterative sequence is defined for the set of positive integers:
 *      n → n/2 (n is even)
 *      n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 *      13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {
    private static boolean visit[];
    public static void main(String[] argv) {
        visit = new boolean[1000000];
        long max = 0, maxCount = -1;
        for(int i = 1; i < 1000000; i++) {
            if(visit[i] == true) continue;
            long tempCount = calculateCount(i);
            if(tempCount > maxCount) {
                maxCount = tempCount;
                max = i;
            }
        }
        System.out.println("The result is " + max);
    }

    public static long calculateCount(int number) {
        long count = 0, temp = number;
        while(temp != 1) {
            if(temp < 1000000) visit[number] = true;
            if(temp % 2 == 0) temp /= 2;
            else temp = temp * 3 + 1;
            count ++;
        }
        return count;
    }
}
