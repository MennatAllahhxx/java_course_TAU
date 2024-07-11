package chapter2;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        System.out.print("please enter a season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.print("please enter an adjective: ");
        String adv = scanner.next();

        System.out.print("please enter a number: ");
        int cupsOfCoffee = scanner.nextInt();

        System.out.println("On a " + adv + " " + season + " day, i drink a minimum of "+ cupsOfCoffee + " cups of coffee");

    }
}