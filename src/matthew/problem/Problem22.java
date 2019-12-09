package matthew.problem;

import matthew.Problem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author zeyuan
 * Create Time : 2019/12/9 8:41 PM
 */
public class Problem22 implements Problem {

    @Override
    public int solve() throws Exception {
        URL url = Problem11.class.getClassLoader().getResource("input22.txt");
        InputStream input = new FileInputStream(url.getFile());
        String file = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());
        String[] split = file.split(",");
        for(int i = 0; i < split.length; i++) {
            split[i] = split[i].substring(1, split[i].length() - 1);
        }
        Arrays.sort(split);
        int result = 0;
        for(int i = 0; i < split.length; i++) {
            char[] single = split[i].toCharArray();
            int count = 0;
            for(int j = 0; j < single.length; j++) {
                count += single[j] - 64;
            }
            result += count * (i + 1);
        }
        return result;
    }

}
