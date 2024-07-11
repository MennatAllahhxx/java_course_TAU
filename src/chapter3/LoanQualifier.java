package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int qualificationSalary = 30000;
        int workingYears = 2;

        System.out.print("please enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.print("please enter the number of years you have been working: ");
        int years = scanner.nextInt();

        if (salary < qualificationSalary) System.out.println("you must earn at least $" + qualificationSalary + " to qualify for the loan");
        else {
            if (years < workingYears) System.out.println("you must have worked at your current jo for at least " + workingYears + " years");
            else System.out.println("Congrats! you are qualified for the loan");
        }
    }
}
