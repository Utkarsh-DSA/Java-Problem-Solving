/*
Q3. Given an integer n, return the difference
between the product of its digits and the sum
of its digits.

LeetCode Problem 1281
*/

public class SubtractProductAndSum {
    public static void main(String[] args) {

        int n = 234;

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            product = product * digit;
            sum = sum + digit;

            n = n / 10;
        }

        int result = product - sum;

        System.out.println("Result = " + result);
    }
}
