package kr.sparta.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class CommonUtil {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void printError() {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }

    public static int getNumber() {
        try {
            int number = Integer.parseInt(br.readLine());
            return number;
        } catch (Exception e) {
            return -1;
        }
    }

}
