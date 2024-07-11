package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items you'd like to scan: ");
        int items = scanner.nextInt();

        double total = 0;

        for (int item = 0; item < items; item++) {
            System.out.print("Enter the cost of the item number " + (item + 1) + ": ");
            total += scanner.nextDouble();
        }

        System.out.println("Your total is: " + total);
    }
}
