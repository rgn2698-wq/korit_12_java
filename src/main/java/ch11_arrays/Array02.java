package ch11_arrays;

import java.util.Scanner;

/*
    1. human 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇명의 학생을 등록하시겠습니까? >>> 5
    1번 학생의 이름을 등록하세요 >>> 김일
    2번 학생의 이름을 등록하세요 >>> 김이
    3번 학생의 이름을 등록하세요 >>> 김삼
    4번 학생의 이름을 등록하세요 >>> 김사
    5번 학생의 이름을 등록하세요 >>> 김오

    score 배열에 점수를 입력할수 있도록 할겁니다.
    1 번학생의 접수를 입력하세요 >>> 4.5
    2 번학생의 접수를 입력하세요 >>> 4.4
    3 번학생의 접수를 입력하세요 >>> 4.3
    4 번학생의 접수를 입력하세요 >>> 4.2
    5 번학생의 접수를 입력하세요 >>> 4.1

    학생들의 총합 점수는 21.5점 입니다.
 */
public class Array02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // 학생수 설정
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println();       // 줄 바꿈

        // 배열 생성
        String[] human = new String[count];
        double[] score = new double[count];

        //학생 이름 입력
        for (int i = 0; i < human.length; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 입력하세요 >>> ");
            human[i] = scanner.nextLine();
        }

        System.out.println();       // 줄 바꿈

        // 점수 총합을 저장
        double sum = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "번 학생의 점수를 입력하세요 >>> ");
            score[i] = scanner.nextDouble();
            sum += score[i];
        }

        // 5. 최종 결과 출력
        System.out.println();
        System.out.println("학생들의 총합 점수는 " + sum + "점 입니다.");



    }
}
