/*
Question:
Write a Java program to check whether a triangle is valid or not.
If it is valid, identify whether it is:
1. Equilateral Triangle
2. Isosceles Triangle
3. Scalene Triangle
*/

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check Triangle Validity
        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {

            System.out.println("Valid Triangle");

            // Check Triangle Type
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
