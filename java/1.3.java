public class Factorial {
    public static void main(String[] args) {
        int n = 5; 
        long startTime = System.nanoTime();
        long factorialValue = factorial(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Factorial of " + n + " using recursion: " + factorialValue);
        System.out.println("Time taken: " + duration + " nanoseconds");
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}