package matthew;

import java.math.BigDecimal;

public class Tools {

    public static boolean isPrime(Long number) {
        Long upper = Math.round(Math.sqrt(number));
        for (Long i = 2L; i <= upper; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int sumOfProperDivisors(int n) {
        int result = 1;
        Long upper = Math.round(Math.sqrt(n));
        for (int i = 2; i <= upper; i++) {
            int divisor = n / i;
            if (divisor * i == n) {
                if (divisor == i) {
                    result += i;
                } else {
                    result += i;
                    result += divisor;
                }
            }
        }
        return result;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static Long fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1L;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
