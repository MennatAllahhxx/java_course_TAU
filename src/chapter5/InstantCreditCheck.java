package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();

        scanner.close();

        boolean isQualified = isUserQualified(salary, creditScore);
        
        notifyUser(isQualified);
    }

    public static double getSalary() {
        System.out.print("Enter your salary: ");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.print("Enter your credit score: ");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) System.out.println("Congrats, you are qualified!");
        else System.out.println("Hard luck!");
    }
}
