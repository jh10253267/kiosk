package kr.sparta.ui;


import kr.sparta.domain.Menu;

import java.util.List;

public class MainUi {
    private MainUi() {
    }

    private static final MainUi instance = new MainUi();

    public static MainUi getInstance() {
        return instance;
    }

    public void printMainPage(List<Menu> menuList) {
        System.out.println("--------------------------------------------");
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요. \n");
        System.out.println("[ SHAKESHACK BURGER MENU ]");
        System.out.println();
        int index = 1;
        for(Menu m : menuList) {
            System.out.printf("%d. %-10s| %s\n", index, m.getName(), m.getDesciption());
            index++;
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5.장바구니 보기");
        System.out.println("6.주문 초기화");
        System.out.println("9.프로그램 종료");
        System.out.println("--------------------------------------------");
    }

}
