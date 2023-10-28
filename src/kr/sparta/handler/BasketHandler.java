package kr.sparta.handler;

import kr.sparta.domain.Basket;
import kr.sparta.domain.Product;
import kr.sparta.ui.BasketUi;
import kr.sparta.util.CommonUtil;


public class BasketHandler {
    private static Basket basketList;
    private final BasketUi basketUi = BasketUi.getInstance();
    private OrderHandler orderHandler = OrderHandler.INSTANCE;

    private BasketHandler() {
        basketList = new Basket();
    }

    private static final BasketHandler instance = new BasketHandler();

    public static BasketHandler getInstance() {
        return instance;
    }

    public void handleMyBasket() throws InterruptedException {
        while_loop:
        while (true) {
            basketUi.printMyBasket(basketList);
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    orderHandler.printOderConfirmPage();
                    basketList.clear();
                    break while_loop;
                case 2:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }
        }
    }

    public void addToMyBasket(Product selectedProduct) {

        basketList.addToBasket(selectedProduct);
    }

    public void clearMyBasket() {
        while_loop:
        while (true) {
            basketUi.printClearConfirmPage();
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    basketList.clear();
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
