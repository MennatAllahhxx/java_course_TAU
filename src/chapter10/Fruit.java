package chapter10;

public class Fruit {
    protected int Calories;

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public void makeJuice() {
        System.out.println("juice is made");
    }
}