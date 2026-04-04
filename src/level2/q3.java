package level2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits in array
        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;     // store in array
            index++;

            number = number / 10;      // remove last digit

            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

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
        System.out.println("Second largest digit is: " + secondLargest);

        sc.close();
    }
}
