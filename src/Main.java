public class Main {

    public static void main(String[] args) {
        long time = System.nanoTime();
        Problem problem = new Problem1();
        int output = problem.solve();
        time = System.nanoTime() - time;
        System.out.println("Result: " + output + "\nTime in nanoseconds: " + time);
    }

//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) {
//            val = x;
//        }
//    }
}
