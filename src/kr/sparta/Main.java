package kr.sparta;

import kr.sparta.data.MenuContext;
import kr.sparta.handler.DetailMenuHandler;
import kr.sparta.handler.MainHandler;
import kr.sparta.util.InputUtil;

public class Main {
    public static void main(String[] args) {
        //이넘으로 분기하는 건 어떨까?
        //전에 만들었던 계산기 프로그램 참고하기.
        MenuContext menuContext = new MenuContext();
        InputUtil inputUtil = InputUtil.getInstance();
        MainHandler mainHandler = MainHandler.INSTANCE;
        DetailMenuHandler detailMenuHandler = new DetailMenuHandler();

        while_loop:
        while (true) {
            mainHandler.printMainPage(menuContext.getMenuList());
            int number = inputUtil.getNumber();
            MenuEnum menuName = null;
            if ( 0 < number && number < 5) {
                menuName = MenuEnum.menuName(number);
            }
            switch (number) {
                case 1:
                case 2:
                case 3:
                case 4:
                    detailMenuHandler.printDetailPage(menuName);
                    break;
                case 9:
                    break while_loop;
                default:
                    inputUtil.printError();
                    break;
            }
        }

    }
}