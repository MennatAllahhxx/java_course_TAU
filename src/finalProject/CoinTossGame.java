package finalProject;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Player player1 = new Player("Ahmed");
        Player player2 = new Player("Menna");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello "+ player1.getName()+", please make your guess");

        boolean flag = false;

        String guess;
        do {
            guess = scanner.next();

            if (guess.equals("tails") || guess.equals("heads")) flag = true;
            else System.out.println("please enter a valid guess");
        } while (!flag);

        player1.setField(guess);

        if (player1.getField().equals("tails")) player2.setField("heads");
        else player2.setField("tails");

        Coin coin = new Coin();

        coin.flip();

        String winningSide = coin.getSide();

        if (winningSide.equals(player1.getField())) System.out.println(player1.getName() + " wins!");
        else if (winningSide.equals(player2.getField())) System.out.println(player2.getName() + " wins!");
    }
}