package level1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input using infinite loop
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // Stop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("Total sum is: " + total);

        sc.close();
    }

}
