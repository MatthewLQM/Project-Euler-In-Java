import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Project Euler in Java
 *
 * @author MatthewLQM
 * <p>
 * Problem 19 Counting Sundays
 * https://projecteuler.net/problem=19
 */
public class Problem19 implements Problem {
    @Override
    public int solve() {
        int days = 0;
        for(int year = 1901; year <= 2000; year ++) {
            for(int month = 1; month <= 12; month++) {
                if(new GregorianCalendar(year, month, 1).get(Calendar.DAY_OF_WEEK) == 1) {
                    days++;
                }
            }
        }
        return days;
    }
}
