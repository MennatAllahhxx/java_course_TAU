package chapter10;

public class Apple extends Fruit {
    public Apple(int calories) {
        setCalories(calories);
    }

    public void removeSeeds() {
        System.out.println("seeds are removed from the apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}