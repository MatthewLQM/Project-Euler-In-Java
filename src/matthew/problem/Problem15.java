package matthew.problem;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 *
 * matthew.Problem 15 Lattice paths
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */
public class Problem15 {

    public static void main(String[] argv) {
        long result = 1;
        for(int i = 0; i < 20; i++) {
            result *= 40 - i;
            result /= i + 1;
        }
        System.out.println("The result is " + result);
    }
}
