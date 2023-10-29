package kr.sparta.ui;

import kr.sparta.domain.Product;

import java.util.List;

public class OrderUi {

    public void printOrderPage(int wNumber) {
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.printf("대기번호는 [ %d ] 번 입니다.", wNumber);
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
    }

    public void printSoldList(List<Product> soldProducts) {
        System.out.println("[ 총 판매상품 목록 현황 ]");
        System.out.println();
        if (soldProducts.size() > 0) {
            System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
            for (Product p : soldProducts) {
                System.out.printf("- %-10s    | W %.1f\n", p.getName(), p.getPrice());
            }
        } else {
            System.out.println("현재까지 판매된 상품이 없습니다.");
        }
        System.out.println();
        System.out.println("1. 돌아가기");

    }

    public void printTake(double take) {
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.printf("현재까지 총 판매된 금액은 [ W %.1f ] 입니다.\n", take);
        System.out.println();
        System.out.println("1. 돌아가기");
    }
}
