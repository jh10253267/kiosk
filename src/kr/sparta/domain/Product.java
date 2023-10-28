package kr.sparta.domain;

import kr.sparta.data.MenuEnum;

public class Product extends Menu{
    //ex) 불고기버거, 사이
    private double price;
    private MenuEnum menuEnum;


    public Product(String name, String description, double price, MenuEnum menuEnum) {
        super(name, description);
        this.price = price;
        this.menuEnum = menuEnum;
    }

    public double getPrice() {
        return price;
    }

    public MenuEnum getMenuEnum() {
        return menuEnum;
    }

    @Override
    public String toString() {
        return "Product{" + super.toString() +
                "price=" + price +
                ", menuEnum=" + menuEnum +
                "} " ;
    }
}
