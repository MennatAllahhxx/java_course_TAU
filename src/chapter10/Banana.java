package chapter10;

public class Banana extends Fruit{
    public Banana(int calories) {
        setCalories(calories);
    }

    public void peel() {
        System.out.println("a banana is peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana milkshake is made");
    }
}