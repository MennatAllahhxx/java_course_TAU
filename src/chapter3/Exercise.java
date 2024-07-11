package chapter3;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dollar = 100;

        //1 cent
        System.out.print("How many pennies would you like? ");
        int pennies = scanner.nextInt();

        //5 cents
        System.out.print("How many nickels would you like? ");
        int nickels = scanner.nextInt();

        //10 cents
        System.out.print("How many dimes would you like? ");
        int dimes = scanner.nextInt();

        //25 cents
        System.out.print("How many quarters would you like? ");
        int quarters = scanner.nextInt();

        int totalCents = pennies + nickels * 5 + dimes * 10 + quarters * 25;

        if (totalCents == dollar) System.out.println("You Win!");
        else if (totalCents < dollar) System.out.println("You Lose. you are " + (dollar - totalCents) + " cents short.");
        else System.out.println("You Lose. you are " + (totalCents - dollar) + " cents over.");
    }
}
