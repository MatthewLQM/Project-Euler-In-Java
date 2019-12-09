package matthew.problem;

import matthew.Problem;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * matthew.Problem 17 Number letter counts
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen)
 * contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Problem17 implements Problem {
    @Override
    public int solve() {
        int result = 0;
        //number 1 - 9
        result += 3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4;
        //number 10 - 19
        result += 3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8;
        //number 20 - 99
        result += 10 * (6 + 6 + 5 + 5 + 5 + 7 + 6 + 6) + 8 * 36;
        int temp = result;
        //number 100 - 999
        result = 36 * 100 + 9 * temp + 7 * 9 + 891 * 10;
        //number 1000
        result += 11 + temp;
        return result;
    }
}
