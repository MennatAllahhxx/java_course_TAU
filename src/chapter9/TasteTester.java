package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setFlavor("chocolate");
        cake.setPrice(18.6);
        System.out.println("Your cake flavor: " + cake.getFlavor());
        System.out.println("Your cake's price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("vanilla");
        birthdayCake.setPrice(24.7);
        birthdayCake.setCandles(22);
        System.out.println("Your cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Your cake's price: " + birthdayCake.getPrice());
        System.out.println("Your candles: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("white chocolate");
        weddingCake.setPrice(30.2);
        weddingCake.setTiers(3);
        System.out.println("Your cake flavor: " + weddingCake.getFlavor());
        System.out.println("Your cake's price: " + weddingCake.getPrice());
        System.out.println("Your tiers: " + weddingCake.getTiers());
    }
}