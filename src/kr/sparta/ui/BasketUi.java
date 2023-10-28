package kr.sparta.ui;

import kr.sparta.domain.Basket;
import kr.sparta.domain.Product;

public class BasketUi {
    private static final BasketUi instance = new BasketUi();

    private BasketUi() {
    }
    public static BasketUi getInstance() {
        return instance;
    }

    public void printMyBasket(Basket basket) {
        System.out.println("--------------------------------------------");
        System.out.println("지금과 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[ ORDERS ]");
        for (Product p : basket.getBasket()) {
            System.out.printf("%-15s| W %.1f | %s\n", p.getName(), p.getPrice(), p.getDesciption());
        }
        System.out.println();
        System.out.println("[ Total ]");
        System.out.printf("W %.1f\n", basket.getBasketTotalPrice());
        System.out.println();
        System.out.println("1. 주문      2. 메뉴판");
        System.out.println("--------------------------------------------");
    }
    public void printClearConfirmPage() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println();
        System.out.println("1. 확인        2. 취소");
    }


}