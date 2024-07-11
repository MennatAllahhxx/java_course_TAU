package chapter4;

import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        int numberOfRolls = 5;
        int numberOfSpaces = 20;
        Random random = new Random();
        int currentSpace = 0;
        int die;
        boolean win = false;

        for (int i = 1; i <= numberOfRolls; i++) {
            die = random.nextInt(6) + 1;
            currentSpace += die;

            System.out.print("Roll #" + i + ": You've rolled a " + die + ". ");
            if (currentSpace < numberOfSpaces && i < numberOfRolls) System.out.println("You are now on space " + currentSpace + " and have " + (numberOfSpaces - currentSpace) + " more to go.");
            else if ( currentSpace == numberOfSpaces) {
                win =  true;
                break;
            }
        }

        if (win) System.out.println("Congrats, you win!");
        else System.out.println("Uh no, hard luck next time:(");
    }
}
