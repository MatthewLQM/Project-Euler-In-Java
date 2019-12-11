package matthew;

import matthew.problem.*;

public class Main {

    public static void main(String[] args) throws Exception {
        long time = System.nanoTime();
        Problem problem = new Problem28();
        int output = problem.solve();
        time = System.nanoTime() - time;
        System.out.println("Result: " + output + "\nTime in nanoseconds: " + time);
        System.out.println(Tools.factorial(9));
    }
}
