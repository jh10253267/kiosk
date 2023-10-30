package kr.sparta.domain;

public class Option {

    private String name;
    private double price;

    public Option(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    ////1. Single(W 5.4)        2. Double(W 9.0)
    @Override
    public String toString() {
        return name + "(₩ " + price + ")";
    }
}
