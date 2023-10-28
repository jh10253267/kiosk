package kr.sparta.ui;

import kr.sparta.data.MenuEnum;
import kr.sparta.domain.Product;
import java.util.List;

public class DetailUi {

    private DetailUi() {
    }
    private static final DetailUi instance = new DetailUi();
    public static DetailUi getInstance() {
        return instance;
    }
    public void printDetailPage(List<Product> productList) {
        MenuEnum menuName = productList.get(0).getMenuEnum();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println();
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.printf("[ %s MENU ]", menuName);
        System.out.println();
        int index = 1;
        for (Product p : productList) {
            System.out.printf("%d. %-15s   | W %.1f | %s", index, p.getName(), p.getPrice(), p.getDesciption());
            System.out.println();
            index++;
        }
        System.out.println();
    }

    public void printChoiceConfirmText(Product selectedProduct) {
        System.out.printf("%-15s   | W %.1f | %s", selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDesciption());
        System.out.println();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println();
        System.out.println("1. 확인        2. 취소");
    }
}
