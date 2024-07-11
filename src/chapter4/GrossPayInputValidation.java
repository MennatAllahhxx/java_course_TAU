package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int maxHours = 40;
        int rate = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours have you worked this week?");
        int workingHours = scanner.nextInt();

        while (workingHours > 40 || workingHours < 1) {
            System.out.println("Working hours must be between 1 and 40. Try again.");
            workingHours = scanner.nextInt();
        }

        System.out.println("Your gross pay is $" + (workingHours * rate));
    }
}
