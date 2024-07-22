package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple apple = new Apple(150);
        apple.makeJuice();

        Fruit fruit = new Apple(150);
        fruit.makeJuice();
        ((Apple) fruit).removeSeeds();

        fruit = new Banana(180);
        fruit.makeJuice();
        ((Banana) fruit).peel();
    }
}