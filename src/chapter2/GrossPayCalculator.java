package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("please enter the working hours: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("please enter the hourly rate: ");
        double rate = scanner.nextDouble();

        System.out.println("your gross pay is: " + (hours * rate));
    }
}
