package ch08_classes;

import java.util.Scanner;

public class ClassAmain {
    public static void main(String[] args) {
                // 객체 생성 방법
                // 클래스명 객체명 = new 클래스명();
            ClassA classA1 = new ClassA();
        Scanner scammer = new Scanner(System.in);

        // 필드에 값 대입하는 방법
        // 객체명, 속성명 = 값;
        classA1.num =1;
        classA1.name = "김일";
        classA1.score = 4.5;

        // 메서드로 호출하는 방법
        // 객체명, 메서드명()
        int num = scammer.nextInt();

        System.out.println(classA1.name + " 학생의 학번은 " + classA1.num
                + " 번 이고, 점수는 " + classA1.score + "점입니다.");

        classA1.callName();

        // ClassA의 객체 classA2를 생성하시고.
        // 김이 / 2 / 100을 필드에 대입하고.
        // 다음과 같이 출력하시오
        // 실행 예
        // 100 번 학생의 이름은 김이이고, 점수는 2.0입니다.
        // 김삼을 부릅니다.

        ClassA classA2 = new ClassA();
        classA2.num = 100;
        classA2.name = "김이";
        classA2.score = 2;

        System.out.println(classA2.num + " 번 학생의 이름은 " +
                classA2.name + "이고, 점수는 " +
                classA2.score + "입니다.");

        classA2.name = "김삼";

        classA2.callName();


        // Car / Carmain
        // CarMian클래스에선 Main적용
    }
}
