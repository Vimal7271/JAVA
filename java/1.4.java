public class PrimeFactors {
    public static void main(String[] args) {
        int number = 84;
        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);
    }

    public static void findPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}