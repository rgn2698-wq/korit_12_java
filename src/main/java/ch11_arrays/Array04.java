package ch11_arrays;

import java.util.Scanner;

/*
    배열을 매개변수로 하는 메서드 정의를 방금 전에 해봤습니다.
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을때.
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것을 목표로 하겠습니다.
 */
public class Array04 {

    public static void main(String[] args) {
        String[] titles = {"김일", "김이", "김삼"};

        /*
            실행 예
            김일 / 김이 / 김삼 /
            이라고 콘솔에 출력될 수 있도록 main에 작성하시오.

            다 하신 분들은
            printElement() 메서드를 정리하고, 매개변수로 String[] 배열을 넣어
            동일한 결과값이 나오도록 method를 작성하시오.
         */

        for (int i = 0 ; i < titles.length; i++) {
            System.out.print(titles[i] + " / ");
        }
        System.out.println();
        Array04 array04 = new Array04();
        array04.printElemnt(titles);
    }

    public void printElemnt(String[] names) { // 매개변수로 names라는 String[]를 집어넣기로 정의.
        for (int i = 0 ; i < names.length; i++) {
            System.out.print(names[i] + " / ");
        }
        System.out.println();
    }
}
