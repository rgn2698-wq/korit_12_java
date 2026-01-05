package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};
        /*
            실행 예
            1 번: 김일
            2 번: 김이
            3 번: 김삼
            4 번: 김사
            5 번: 김오
            로 출력되도록 일반 for문으로 한 번 / 향상된 for문으로 한번
         */

        // 일반 for문
        for ( int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + " 번: " + persons[i]);
        }
        System.out.println();
        // 향상된 for문
        int num = 1;
        for (String person : persons) {
            System.out.println(num++ + "번: " + person);
        }
    }
}
