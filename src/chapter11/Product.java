package chapter11;

public interface Product {
    String getName();
    void setName(String name);

    double getPrice();
    void setPrice(double price);

    String getColor();
    void setColor(String color);

    default String getBarcode() {
        return "no barcode";
    }
}