package kr.sparta.handler;

import kr.sparta.domain.Menu;
import kr.sparta.ui.MainUi;

import java.util.List;

public enum MainHandler {
    INSTANCE;
    private MainUi mainUi;

    MainHandler() {
        this.mainUi = MainUi.getInstance();
    }

    public void printMainPage(List<Menu> menuList) {
        mainUi.printMainPage(menuList);
    }
}


