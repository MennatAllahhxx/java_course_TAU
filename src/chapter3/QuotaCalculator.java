package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("please enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) System.out.println("Congrats! You've met the quota");
        else System.out.println("You are " + (quota - sales) + " sales short to meet your quota!");
    }
}
