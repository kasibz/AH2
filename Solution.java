import java.lang.Math;

public class Solution {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        // two is a prime number!
        if (num == 2)
            return true;

        // take square root floor of the number

        // iterate from 2 to the root floor + 1
        double rootDouble = Math.sqrt(num);
        long rootInt = Math.round(rootDouble);

        /*
         * check if number evenly divides during the loop. if it divides
         * evenly, the number is not prime. if the loop finishes. it is prime.
         */

        for (int i = 2; i < rootInt + 1; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(Solution.isPrime(2));
        System.out.println(Solution.isPrime(0));
        System.out.println(Solution.isPrime(1));
        System.out.println(Solution.isPrime(31));
        System.out.println(Solution.isPrime(75));
    }
}