package chapter7;

import java.util.Scanner;

public class Exercise {
    private static Scanner scanner = new Scanner(System.in);

    private static String[] daysOfTheWeek;
    private static int dayNumber;
    public static void main(String[] args) {
        System.out.print("Please enter the day number: ");

        do {
            dayNumber = scanner.nextInt();
            if (dayNumber > 7 || dayNumber < 1) {
                System.out.println("Please enter a number between 1 and 7");
                System.out.print("Enter the day number: ");
            }

        } while ( dayNumber > 7 || dayNumber < 1);

        generateDaysArray();

        System.out.println("Your day is: " + getDay());
    }

    public static void generateDaysArray() {
        daysOfTheWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    public static String getDay() {
        return daysOfTheWeek[dayNumber - 1];
    }
}