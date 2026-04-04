package level2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest friend is: " + names[youngestIndex] +
                " with age " + ages[youngestIndex]);

        System.out.println("Tallest friend is: " + names[tallestIndex] +
                " with height " + heights[tallestIndex] + " cm");

        sc.close();
    }
}
