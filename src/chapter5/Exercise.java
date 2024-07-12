package chapter5;

import java.util.Scanner;

public class Exercise {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();

        double overageFee = calculateOverageFee(overageMinutes);

        double subtotal = planFee + overageFee;

        double tax = calculateTaxes(subtotal);

        printPhoneBillStatement(planFee, overageFee, tax);
    }

    public static double getPlanFee() {
        System.out.print("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes() {
        System.out.print("Enter overage minutes: ");
        return scanner.nextInt();
    }

    public static double calculateOverageFee(int overageMinutes) {
        double minuteFee = 0.25;
        return (overageMinutes * minuteFee);
    }

    public static double calculateTaxes(double subtotal) {
        double taxesPercentage = 0.15;
        return (taxesPercentage * subtotal);
    }

    public static void printPhoneBillStatement(double planFee, double overageFee, double tax) {
        System.out.println("Phone Bill Statement");

        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (planFee + overageFee + tax));
    }
}
