package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + calculateAverage());
        System.out.println("Highest: " + getHighestGrade());
        System.out.println("Lowest: " + getLowestGrade());
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade #" + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }
        Arrays.sort(grades);
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }

        return sum;
    }

    public static double calculateAverage() {
        return ((double)calculateSum())/grades.length;
    }

    public static int getHighestGrade() {
        return grades[grades.length -1];
    }

    public static int getLowestGrade() {
        return grades[0];
    }
}