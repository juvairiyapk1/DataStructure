public class Factorial {

    public static int calculateFactorial(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {

            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = calculateFactorial(5);
        System.out.println("Factorial of 5: " + result);
    }
}
