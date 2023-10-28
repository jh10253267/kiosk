package kr.sparta.data;

import java.util.Arrays;

public enum MenuEnum {
    BURGER(1) {
        @Override
        public MenuEnum getMenuName(int menuNumber) {
            return BURGER;
        }
    }, ICECREAM(2) {
        @Override
        public MenuEnum getMenuName(int menuNumber) {
            return ICECREAM;
        }
    }, DRINKS(3) {
        @Override
        public MenuEnum getMenuName(int menuNumber) {
            return DRINKS;
        }
    }, BEER(4) {
        @Override
        public MenuEnum getMenuName(int menuNumber) {
            return BEER;
        }
    };
    private final int menuNumber;

    MenuEnum(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    public abstract MenuEnum getMenuName(int menuNumber);

    public static MenuEnum menuName(int number) {
        MenuEnum menuEnum = Arrays.stream(values())
                .filter(v -> v.menuNumber == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("변환할 수 없는 값입니다."));

        return menuEnum.getMenuName(number);
    }
}
