package kr.sparta.handler;

import kr.sparta.ui.OrderUi;

public enum OrderHandler {
    INSTANCE;
    private static int waitingNumber = 0;
    private final OrderUi orderUi;
    OrderHandler() {
        orderUi = OrderUi.getInstance();
    }
    public void printOderConfirmPage() throws InterruptedException {
        ++waitingNumber;
        orderUi.printOrderPage(waitingNumber);
        Thread.sleep(3000);
    }
}
