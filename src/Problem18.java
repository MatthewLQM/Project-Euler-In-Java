import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * Problem 18 Maximum path sum I
 * https://projecteuler.net/problem=18
 */
public class Problem18 implements Problem {
    @Override
    public int solve() {
        try {
            URL url = Problem11.class.getClassLoader().getResource("input18.txt");
            InputStream input = new FileInputStream(url.getFile());
            Scanner sc = new Scanner(input);
            int[][] table = new int[15][15];
            for (int i = 0; i < 15; i++) {
                for (int j = i; j >= 0; j--) {
                    int temp = sc.nextInt();
                    table[i][i - j] = temp;
                }
            }
            for (int i = 13; i >= 0; i--) {
                for (int j = 0; j < i + 1; j++) {
                    table[i][j] += Math.max(table[i + 1][j], table[i + 1][j + 1]);
                }
            }
            return table[0][0];
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }


    }
}
