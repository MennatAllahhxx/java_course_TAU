package chapter6;

public class PhoneBillCalculator {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBillCalculator() {
        this.id = 0;
        this.baseCost = 80;
        this.allottedMinutes = 800;
        this.minutesUsed = 800;
    }

    public PhoneBillCalculator(int id) {
        this.id = id;
        this.baseCost = 80;
        this.allottedMinutes = 800;
        this.minutesUsed = 800;
    }

    public PhoneBillCalculator(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        double overageRate = 0.25;
        return (minutesUsed - allottedMinutes) * overageRate;
    }

    public double calculateTax() {
        double taxPercentage = 0.14;
        return (baseCost + calculateOverage()) * taxPercentage;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printPhoneBill() {
        System.out.println("ID: " + id);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: " + calculateTotal());
    }
}