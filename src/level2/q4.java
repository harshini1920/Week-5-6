package level2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits dynamically
        while (number != 0) {
            // Resize array if full
            if (index == maxDigit) {
                maxDigit += 10;

                int[] temp = new int[maxDigit];

                // Copy old data to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // reassign
            }

            int digit = number % 10;
            digits[index] = digit;
            index++;

            number = number / 10;
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("Largest digit is: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit (all digits may be same)");
        } else {
            System.out.println("Second largest digit is: " + secondLargest);
        }

        sc.close();
    }
}
