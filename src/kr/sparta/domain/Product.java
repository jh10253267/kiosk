package kr.sparta.domain;

import kr.sparta.MenuEnum;

public class Product extends Menu{
    private double price;
    private MenuEnum menuEnum;


    public Product(String name, String desciption, double price, MenuEnum menuEnum) {
        super(name, desciption);
        this.price = price;
        this.menuEnum = menuEnum;
    }

    public double getPrice() {
        return price;
    }

    public MenuEnum getMenuEnum() {
        return menuEnum;
    }
}
