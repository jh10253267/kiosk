package kr.sparta;

import kr.sparta.data.MenuContext;
import kr.sparta.data.MenuEnum;
import kr.sparta.handler.BasketHandler;
import kr.sparta.handler.DetailMenuHandler;
import kr.sparta.handler.MainHandler;
import kr.sparta.handler.OrderHandler;
import kr.sparta.util.CommonUtil;

public class KioskApp {
    public static void main(String[] args) throws InterruptedException {
        MenuContext menuContext = MenuContext.INSTANCE;
        MainHandler mainHandler = MainHandler.INSTANCE;
        DetailMenuHandler detailMenuHandler = DetailMenuHandler.getInstance();
        BasketHandler basketHandler = BasketHandler.getInstance();
        OrderHandler orderHandler = OrderHandler.INSTANCE;

        //프로그램을 실행시키면 제일먼저 메인 화면을 보여주고 사용자에게 입력을 받는다.
        //0번은 관리자 메뉴로 현재까지 판매된 상품과 금액을 보여준다.
        //1~4번은 상세메뉴로 이동하는 선택이기 때문에 각 번호에 맞는 메뉴 이름을 찾아서 다음 클래스에게 전달해준다.
        //1~4 상세 메뉴 보기/ 5장바구니/6 진행중인 주문 취소/9 프로그램 종료.
        while_loop:
        while (true) {
            mainHandler.printMainPage(menuContext.getMenuList());
            int number = CommonUtil.getNumber();
            MenuEnum menuName = null;
            if (0 < number && number < 5) {
                menuName = MenuEnum.menuName(number);
            }

            switch (number) {
                case 0:
                    orderHandler.printSoldList();
                    orderHandler.printTake();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    detailMenuHandler.handleDetailPage(menuName);
                    break;
                case 5:
                    basketHandler.handleMyBasket();
                    break;
                case 6:
                    basketHandler.clearMyBasket();
                    break;
                case 9:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }
        }

    }
}