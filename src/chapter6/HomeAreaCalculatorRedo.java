package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        System.out.println("Kitchen-----------------");
        Rectangle kitchen = calculator.getRoom();
        System.out.println("Bathroom-----------------");
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("Total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.print("please enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.print("please enter the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
