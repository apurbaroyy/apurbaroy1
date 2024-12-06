public class FactorialHelper {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
public class FactorionFinder {
    public static boolean isFactorion(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += FactorialHelper.factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100000;

        System.out.println("Factorion numbers in the range:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
            }
        }
    }
}
