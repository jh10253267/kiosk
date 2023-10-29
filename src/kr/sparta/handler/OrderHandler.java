package kr.sparta.handler;

import kr.sparta.domain.Order;
import kr.sparta.domain.Product;
import kr.sparta.ui.OrderUi;
import kr.sparta.util.CommonUtil;

import java.util.Map;

public enum OrderHandler {
    INSTANCE;
    private static int waitingNumber = 0;
    private OrderUi orderUi;
    private Order order = Order.INSTANCE;

    OrderHandler() {
        orderUi = new OrderUi();
    }

    //주문하기 버튼을 눌렀을 때 호출되는 클래스.
    public void printOderConfirmPage() throws InterruptedException {
        ++waitingNumber;
        orderUi.printOrderPage(waitingNumber);
        Thread.sleep(3000);
    }

    public void updateOrderInfo(Map<Product, Integer> basket, double basketTotalPrice) {
        order.updateOrderInfo(basket, basketTotalPrice);
    }
    public void printSoldList() {
        orderUi.printSoldList(order.getSoldProducts());
        while_loop:
        while (true) {
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }
        }
    }

    public void printTake() {
        while_loop:
        while(true) {
            orderUi.printTake(order.getTake());
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break ;
            }
        }
    }

}
