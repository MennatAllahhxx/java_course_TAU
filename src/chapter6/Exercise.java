package chapter6;

public class Exercise {
    public static void main(String[] args) {
        PhoneBillCalculator bill = new PhoneBillCalculator(651);
        bill.setMinutesUsed(7000);
        bill.setAllottedMinutes(6000);
        bill.setBaseCost(200);
        bill.printPhoneBill();
    }
}