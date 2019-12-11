package matthew.problem;

import matthew.Problem;

/**
 * @author zeyuan
 * Create Time : 2019/12/11 4:10 PM
 * You are the 145467th person to have solved this problem.
 *
 * Nice work, MatthewLQM, you've just advanced to Level 1 .
 * 112492 members (11.64%) have made it this far.
 */
public class Problem25 implements Problem {

    private int[] a = new int[1000], b = new int[1000], temp = new int[1000];

    @Override
    public int solve() throws Exception {
        int i = 3;
        a[0] = 1;
        b[0] = 2;
        while (b[999] <= 0) {
            temp = add(a, b);
            a = b;
            b = temp;
            i++;
        }
        return i;
    }

    private int[] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            result[i] = (a[i] + b[i]) % 10 + c;
            c = (a[i] + b[i]) / 10;
        }
        return result;
    }

}
