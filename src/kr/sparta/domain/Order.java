package kr.sparta.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//주문과 관련된 자료들을 저장하는 클래스. 주문완료된 상품 리스트, 판매된 상품들의 가격 합(수입).
public enum Order {
    INSTANCE;
    private List<Product> soldProducts;
    private double take;

    Order() {
        soldProducts = new ArrayList<>();
        take = 0.0;
    }

    //선택 요구사항 3,4번에 대한 메소드
    //만약 상품의 갯수가 1개 이상이면 중복 저장하도록 작성.
    public void updateOrderInfo(Map<Product, Integer> basket, double basketTotalPrice) {
        for (Product p : basket.keySet()) {
            if (basket.get(p) > 1) {
                for (int i = 0; i < basket.get(p); i++) {
                    soldProducts.add(p);
                }
            } else {
                soldProducts.add(p);

            }
            take += basketTotalPrice;
        }
    }

    //판매 완료된 상품 리스트를 리턴해주는 메소드.
    public List<Product> getSoldProducts() {
        return soldProducts;
    }

    //현재까지 판매된 상품들의 총 금액을 리턴해주는 메소드.
    public double getTake() {
        return take;
    }
}
