/*
Question:
Write a Java program to input two numbers
and find the largest number using if-else.
*/

public class LargestOfTwo {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;

        if (a > b) {
            System.out.println(a + " is the largest number.");
        } else if (b > a) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
