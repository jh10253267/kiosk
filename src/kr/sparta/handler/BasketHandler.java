package kr.sparta.handler;

import kr.sparta.domain.Basket;
import kr.sparta.domain.Product;
import kr.sparta.ui.BasketUi;
import kr.sparta.util.CommonUtil;

public class BasketHandler {
    private BasketUi basketUi = new BasketUi();
    private Basket myBasket;

    private BasketHandler() {
        myBasket = Basket.INSTANCE;
    }
    private static final BasketHandler instance = new BasketHandler();
    public static BasketHandler getInstance() {
        return instance;
    }
    private OrderHandler orderHandler = OrderHandler.INSTANCE;

    //장바구니 화면에서 처리해 줘야할 부분을 처리하는 클래스.
    //내 장바구니를 보여주고 1번을 누르면 주문하기 2번을 누르면 취소하기 처리하는 메소드.
    public void handleMyBasket() throws InterruptedException {
        while_loop:
        while (true) {
            basketUi.printMyBasket(myBasket);
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    orderHandler.updateOrderInfo(myBasket.getBasket(), myBasket.getBasketTotalPrice());
                    myBasket.clear();
                    orderHandler.printOderConfirmPage();
                    break while_loop;
                case 2:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }
        }
    }

    //상세 메뉴 페이지에서 상품을 장바구니에 추가해주는 메소드.
    public void addToMyBasket(Product selectedProduct) {
        myBasket.addToBasket(selectedProduct);
    }
    //장바구니를 초기화해주는 메소드.
    public void clearMyBasket() {
        while_loop:
        while (true) {
            basketUi.printClearConfirmPage();
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    myBasket.clear();
                    basketUi.printBasketResetText();
                    break while_loop;
                case 2:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }

        }
    }

}
