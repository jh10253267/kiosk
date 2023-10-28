package kr.sparta;

import kr.sparta.data.MenuContext;
import kr.sparta.data.MenuEnum;
import kr.sparta.handler.BasketHandler;
import kr.sparta.handler.DetailMenuHandler;
import kr.sparta.handler.MainHandler;
import kr.sparta.util.CommonUtil;

public class KioskApp {
    public static void main(String[] args) throws InterruptedException {
        MenuContext menuContext = MenuContext.INSTANCE;
        MainHandler mainHandler = MainHandler.INSTANCE;
        DetailMenuHandler detailMenuHandler = DetailMenuHandler.getInstance();
        BasketHandler basketHandler = BasketHandler.getInstance();

        while_loop:
        while (true) {
            mainHandler.printMainPage(menuContext.getMenuList());
            int number = CommonUtil.getNumber();
            MenuEnum menuName = null;
            if (0 < number && number < 5) {
                menuName = MenuEnum.menuName(number);
            }

            switch (number) {
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