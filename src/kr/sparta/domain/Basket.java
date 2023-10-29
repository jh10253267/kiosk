package kr.sparta.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    //장바구니 목록.
    private static Map<Product, Integer> basket;
    private static double basketTotalPrice;

    public Basket() {
        basket = new HashMap<>();
    }

    public Map<Product, Integer> getBasket() {
        return basket;
    }

    private double calculateBasketTotalPrice() {
        double totalPrice = 0.0;

        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue().doubleValue();
        }

        return totalPrice;
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
        basket.put(product, basket.getOrDefault(product, 0) + 1);
    }


}

