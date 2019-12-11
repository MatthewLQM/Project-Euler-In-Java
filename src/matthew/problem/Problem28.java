package matthew.problem;

import matthew.Problem;

/**
 * @author zeyuan
 * Create Time : 2019/12/11 6:46 PM
 *
 * You are the 101185th person to have solved this problem.
 */
public class Problem28 implements Problem {

    private final int max = 1001;

    @Override
    public int solve() throws Exception {
        int result = 1;
        for (int i = 3; i <= max; i = i + 2) {
            int n = i - 2;
            result += n * n + n + 1;
            result += n * n + n + 1 + n + 1;
            result += n * n + n + 1 + 2 * (n + 1);
            result += n * n + n + 1 + 3 * (n + 1);
        }
        return result;
    }
}
