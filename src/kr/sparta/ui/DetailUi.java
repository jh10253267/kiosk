package kr.sparta.ui;

import kr.sparta.MenuEnum;
import kr.sparta.data.MenuContext;
import kr.sparta.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class DetailUi {

    private DetailUi() {
    }

    private static final DetailUi instance = new DetailUi();

    public static DetailUi getInstance() {
        return instance;
    }

    MenuContext menuContext = new MenuContext();

    public void printDetailPage(MenuEnum menuName) {
        List<Product> productList = menuContext.getProductList().stream()
                .filter(v -> v.getMenuEnum().equals(menuName))
                .collect(Collectors.toList());

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
}
