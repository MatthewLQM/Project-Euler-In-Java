package matthew.problem;

import matthew.Problem;

/**
 * @author zeyuan
 * Create Time : 2019/12/11 4:31 PM
 *
 * You are the 77784th person to have solved this problem.
 */
public class Problem26 implements Problem {

    private final int max = 1000;

    @Override
    public int solve() throws Exception {
        int result = 0, originValue = 0;
        for (int i = 2; i <= max; i++) {
            int temp = cycleLength(i);
            if (temp > result) {
                result = temp;
                originValue = i;
            }
        }
        System.out.println(result + "=" + originValue);
        return originValue;
    }

    private int cycleLength(int x) {
        // 1.商 2.余数 值为次序
        int[][] result = new int[10001][1001];
        int begin = 1;
        int index = 1;
        int ret = 0;
        while(true) {
            while(begin < x) {
                begin *= 10;
            }
            int quotient = begin / x;
            int remainder = begin % x;
            if(remainder == 0) {
                ret = 0;
                break;
            }
            if(result[quotient][remainder] != 0) {
                ret = index - result[quotient][remainder];
                break;
            }
            result[quotient][remainder] = index;
            begin = remainder;
            index ++;
        }
        return ret;
    }
}
