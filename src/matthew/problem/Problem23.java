package matthew.problem;

import matthew.Problem;
import matthew.Tools;

/**
 * @author zeyuan
 * Create Time : 2019/12/10 7:23 PM
 * You are the 96627th person to have solved this problem.
 */
public class Problem23 implements Problem {

    private final int max = 28124;

    @Override
    public int solve() throws Exception {
        int[] sumOfDivisors = new int[max];
        boolean[] abundants = new boolean[max], canSum = new boolean[max];
        for (int i = 1; i < max; i++) {
            sumOfDivisors[i] = Tools.sumOfProperDivisors(i);
            if (i >= sumOfDivisors[i]) {
                abundants[i] = false;
            } else {
                abundants[i] = true;
            }
        }
        for (int i = 1; i < max; i++) {
            for (int j = 1; j <= i; j++) {
                if (abundants[i] && abundants[j] && i + j < max) {
                    canSum[i + j] = true;
                }
            }
        }
        int result = 0;
        for(int i = 1; i < max; i++) {
            if(!canSum[i]) {
                result += i;
            }
        }
        return result;
    }

}
