package kr.sparta.handler;

import kr.sparta.ui.OrderUi;

public enum OrderHandler {
    INSTANCE;
    private static int waitingNumber = 0;
    OrderHandler() {
    }
    public void printOderConfirmPage() throws InterruptedException {
        OrderUi orderUi = new OrderUi();
        ++waitingNumber;
        orderUi.printOrderPage(waitingNumber);
        Thread.sleep(3000);
    }
}
