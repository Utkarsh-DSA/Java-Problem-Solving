/*
Q3. Write a Java program to check whether
a given number is a Perfect Number or not.

A Perfect Number is a number whose proper
divisors add up to the number itself.
*/

public class PerfectNumber {
    public static void main(String[] args) {

        int num = 28;
        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
