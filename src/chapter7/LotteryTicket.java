package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    public static final int MAXIMUM_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] tickets = generateTickets();
        Arrays.sort(tickets);
        printTickets(tickets);
    }

    public static int[] generateTickets() {
        Random random = new Random();

        int[] tickets = new int[LENGTH];
        int randomNumber;

        for (int i = 0; i < LENGTH; i++) {
            do {
                randomNumber = random.nextInt(MAXIMUM_TICKET_NUMBER) + 1;
            } while (search(tickets, randomNumber));

            tickets[i] = randomNumber;
        }

        return tickets;
    }

    public static boolean search(int[] tickets, int numberToSearchFor) {
        for (int i = 0; i < LENGTH; i++) {
            if (tickets[i] == numberToSearchFor) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] tickets, int numberToSearchFor) {
        int index = Arrays.binarySearch(tickets, numberToSearchFor);
        if (index >= 0) return true;
        return false;
    }

    public static void printTickets(int[] tickets) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(tickets[i]);
        }
    }
}