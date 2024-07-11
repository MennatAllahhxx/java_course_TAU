package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        int qualificationSalary = 30000;
        int workingYears = 2;

        System.out.print("please enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.print("please enter the number of years you have been working: ");
        int years = scanner.nextInt();

        if (salary > qualificationSalary && years > workingYears)
            System.out.println("Congrats! you are qualified for the loan");
        else
            System.out.println("you are not qualified for the loan");
    }
}
