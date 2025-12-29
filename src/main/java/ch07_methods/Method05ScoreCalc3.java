package ch07_methods;

import java.util.Scanner;

public class Method05ScoreCalc3 {
    // method 정의 영역 - 이전의 메서드03에서 정의한 방식은 하나의 메서드에 총합을 구하는 메서드와
    // 평균을 구하는 메서드가 합쳐져 있었습니다.

    // 이번 단계에서는 1. 합을 구하는 메서드 / 2. 평균을 구하는 메서드를 작성하고
    // 평균을 구하는 메서드 내에서 합을 구하는 메서드를 호출하는 방식으로 작성할겁니다.

    // 그리고 메서드 호출 영역에는 '평균을 구하는 메서드'만 호출할겁니다.

    // 1. 합을 구하는 메서드
    public static double calcSum(int numOfSubs) {
        double sum = 0;                     //지역변수 sum 선언 및 초기화
        Scanner scanner = new Scanner(System.in);
        // numOfSubs를 쓰는게 아니라 매개변수 numOfSubs를 쓴다는 뜻.
        //int numOfSubs = scanner.nextInt();
        for ( int i = 0 ; i < numOfSubs ; i++ ) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요. >>> ");
            sum += scanner.nextDouble();
        }
        return sum;
    }

    // 2. 평균을 구하는 메서드
    public static void calcAvg() {
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 선언
        int numOfSubs = 0;
        double avgScore = 0;
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();   // 이건 Java 내장 method를 호출한 경우죠.
        double sum = calcSum(numOfSubs); // method 내에서 사용자 정의 method를 호출하는 것이 가능합니다.
        avgScore = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avgScore + "입니다.");
    }


    public static void main(String[] args) {
        // method 호출 영역
        calcAvg();
    }

}
