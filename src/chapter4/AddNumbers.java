package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again;
        int num1, num2;

        do {
            System.out.print("Enter your first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter your second number: ");
            num2 = scanner.nextInt();

            System.out.println("Your sum is: " + (num1 + num2));

            System.out.println("Do you want to try again? True or false?");
            again = scanner.nextBoolean();
        } while (again);
    }
}
