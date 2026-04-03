package level1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }

}
