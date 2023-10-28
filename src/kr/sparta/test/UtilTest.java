package kr.sparta.test;

import kr.sparta.util.CommonUtil;

public class UtilTest {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요.");
        int number = CommonUtil.getNumber();
        System.out.println(number);
        CommonUtil.printError();
    }
}
