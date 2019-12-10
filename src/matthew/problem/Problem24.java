package matthew.problem;

import matthew.Problem;
import matthew.Tools;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zeyuan
 * Create Time : 2019/12/10 7:49 PM
 */
public class Problem24 implements Problem {

    private final int numbers = 10;

    private final int target = 1000000;

    public static void main(String[] args) {
        List<Long> begin = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            begin.add(i);
        }
        System.out.println(new Problem24().findTarget(begin, 1000000));
    }

    @Override
    public int solve() throws Exception {
        List<Long> begin = new ArrayList<>();
        for (long i = 0; i < numbers; i++) {
            begin.add(i);
        }
        return (int) findTarget(begin, target);
    }

    private long findTarget(List<Long> numbers, int ranking) {
        if (numbers.size() == 1) {
            return numbers.get(0);
        } else if (numbers.size() == 2) {
            if (ranking == 0) {
                return numbers.get(1) * 10 + numbers.get(0);
            } else {
                return numbers.get(0) * 10 + numbers.get(1);
            }
        } else {
            int divisor = ranking / Tools.factorial(numbers.size() - 1);
            if (divisor == 0) {
                long result = numbers.get(0);
                numbers.remove(0);
                return result * (long) Math.pow(10, numbers.size()) + findTarget(numbers, ranking);
            } else if (divisor * Tools.factorial(numbers.size() - 1) == ranking) {
                long result = numbers.get(divisor - 1);
                numbers.remove(divisor - 1);
                return result * (long) Math.pow(10, numbers.size()) + findTarget(numbers, 0);
            } else {
                long result = numbers.get(divisor);
                numbers.remove(divisor);
                return result * (long) Math.pow(10, numbers.size()) + findTarget(numbers, ranking - divisor * Tools.factorial(numbers.size()));
            }
        }
    }
}
