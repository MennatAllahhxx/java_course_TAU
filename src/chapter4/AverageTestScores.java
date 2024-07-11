package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 24;
        int numberOfTests = 4;
        double total;

        for (int i = 1; i <= numberOfStudents; i++) {
            total = 0;
            System.out.println("For student number " + i + ":");

            for (int j = 1; j <= numberOfTests; j++) {
                System.out.print("enter score for test number " + j + ": ");
                total += scanner.nextDouble();
            }

            System.out.println("Average score for student number " + i + " is: "+ (total/numberOfTests));
            System.out.println();
        }
    }
}
