/*
Q1. Write a Java program to count the
total number of digits in a given integer.
*/

public class CountDigits {
    public static void main(String[] args) {

        int num = 45872;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Total Digits = " + count);
    }
}
