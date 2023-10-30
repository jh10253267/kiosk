package kr.sparta.domain;

import java.util.HashMap;
import java.util.Map;

public enum Basket {
    //장바구니, 주문과 관련된 데이터
    INSTANCE;
    private final Map<Product, Integer> basket;
    private double basketTotalPrice;

    Basket() {
        basket = new HashMap<>();
        basketTotalPrice = 0.0;
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

