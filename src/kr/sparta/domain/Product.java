package kr.sparta.domain;

import kr.sparta.data.MenuEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product extends Menu {
    //ex) 불고기버거, 사이다
    private double price;
    private MenuEnum menuEnum;
    private List<Option> optionList = new ArrayList<>();

    public Product(String name, String description, double price, MenuEnum menuEnum, List<Option> optionList) {
        super(name, description);
        this.price = price;
        this.menuEnum = menuEnum;
        this.optionList = optionList;
    }

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

    public List<Option> getOptionList() {
        return optionList;
    }

    public Product createProduct(int choiceOption) {
        Option option = optionList.get(choiceOption - 1);
        return new Product(getName(), getDescription(), option.getPrice(), getMenuEnum(), getOptionList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && menuEnum == product.menuEnum && Objects.equals(optionList, product.optionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, menuEnum, optionList);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", menuEnum=" + menuEnum +
                ", optionList=" + optionList +
                "} " + super.toString();
    }
}
