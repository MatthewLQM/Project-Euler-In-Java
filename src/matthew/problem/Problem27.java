package matthew.problem;

import matthew.Problem;
import matthew.Tools;

/**
 * @author zeyuan
 * Create Time : 2019/12/11 5:37 PM
 */
public class Problem27 {

    public static void main(String[] args) throws Exception {
        int a = -61, b = 971;
        long n = 0;
        while(Tools.isPrime(n * n + a * n + b)) {
            n++;
        }
        System.out.println("a=" + a + ",b=" + b + ",max=" + n + ",result=" + a * b);
        System.out.println(new Problem27().solve());
    }

    public long solve() throws Exception {
        long aResult = -1000, bResult = -1000, resultMax = -1;
        for(long a = -995; a < 1000; a++) {
            for(long b = -1000; b <= 1000; b++) {
                long n = 0;
                while (Tools.isPrime(n * n + a * n + b)) {
                    n ++;
                }
                if(n - 1 > resultMax) {
                    aResult = a;
                    bResult = b;
                    resultMax = n - 1;
                }
            }
        }
        System.out.println("a=" + aResult + ",b=" + bResult + ",max=" + resultMax);
        return aResult * bResult;
    }
}
