package kr.sparta.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {
    private final BufferedReader br;
    private InputUtil() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }
    private static final InputUtil instance = new InputUtil();

    public static InputUtil getInstance() {
        return instance;
    }

    public int getNumber() {
        try {
            int number = Integer.parseInt(br.readLine());
            return number;
        } catch (IOException e) {
            return -1;
        }
    }
    public void printError() {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }

}
