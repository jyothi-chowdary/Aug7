public class Prime1t0100 {
    public static void main(String[] args) {
        for (int j = 2; j <= 100; j++) {
            boolean isPrime = true;

            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(j);
            }
        }
   