package kr.sparta.domain;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    //장바구니 목록.
    private static List<Product> basket;
    private static double basketTotalPrice;

    public Basket() {
        basket = new ArrayList<>();
    }

    public static List<Product> getBasket() {
        return basket;
    }
    private double calculateBasketTotalPrice() {
        return basket.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public double getBasketTotalPrice() {
        basketTotalPrice = calculateBasketTotalPrice();
        return basketTotalPrice;
    }
    public void clear() {
        basket.clear();
        basketTotalPrice = 0.0;
    }
    public void addToBasket(Product product) {
        basket.add(product);
    }
}
