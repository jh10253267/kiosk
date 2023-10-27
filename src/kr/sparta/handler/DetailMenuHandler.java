package kr.sparta.handler;

import kr.sparta.MenuEnum;
import kr.sparta.ui.DetailUi;
import kr.sparta.util.InputUtil;

public class DetailMenuHandler {
    private final DetailUi detailUi = DetailUi.getInstance();
    InputUtil inputUtil = InputUtil.getInstance();

    public void printDetailPage(MenuEnum menuName) {
        detailUi.printDetailPage(menuName);
        int number = inputUtil.getNumber();
        System.out.println(number);
    }

}
