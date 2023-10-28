package kr.sparta.ui;

public class OrderUi {
    private OrderUi() {
    }
    private static final OrderUi instance =  new OrderUi();

    public static OrderUi getInstance() {
        return instance;
    }

    public void printOrderPage(int wNumber) {
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.printf("대기번호는 [ %d ] 번 입니다.", wNumber);
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
    }

}
