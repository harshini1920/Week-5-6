package level3;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Step 1: Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Step 3: Frequency array (0–9 digits)
        int[] frequency = new int[10];

        // Step 4: Count frequency
        for (int i = 0; i < count; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Step 5: Display frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }

}
