package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char searchedCapitalLetter = 'A';
        char searchedSmallLetter = 'a';
        boolean found = false;

        System.out.println("Please enter your text to be searched:");
        String text = scanner.next();


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == searchedCapitalLetter || text.charAt(i) == searchedSmallLetter)
            {
                System.out.println("the letter is found ^-^");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("letter is not found :(");
    }
}
