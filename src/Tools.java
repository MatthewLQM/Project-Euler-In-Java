public class Tools {

    public static boolean isPrime(Long number) {
        Long upper = Math.round(Math.sqrt(number));
        for(Long i = 2L; i <= upper; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
