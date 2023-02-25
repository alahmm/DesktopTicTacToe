package strean;

import java.util.Scanner;
import java.util.stream.*;

class PrimeNumbers {

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    public static boolean test(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0 ) {
                return true;
            }

        }
        return false;
    }
    private static boolean isPrime(long number) {

        return !test(number);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}
