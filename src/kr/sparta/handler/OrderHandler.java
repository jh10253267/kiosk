package kr.sparta.handler;

import kr.sparta.ui.OrderUi;

public enum OrderHandler {
    INSTANCE;
    private static int waitingNumber = 0;
    private final OrderUi orderUi;
    OrderHandler() {
        orderUi = OrderUi.getInstance();
    }
    //주문하기 버튼을 눌렀을 때 호출되는 클래스.
    public void printOderConfirmPage() throws InterruptedException {
        ++waitingNumber;
        orderUi.printOrderPage(waitingNumber);
        Thread.sleep(3000);
    }
}
