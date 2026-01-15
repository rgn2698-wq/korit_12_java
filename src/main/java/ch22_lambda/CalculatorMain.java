package ch22_lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.compute(a, b);
    }

    public static void main(String[] args) {
        /*
            정의한 Interface Calculator를 활용 -> 람다식으로
            현재 인터페이스 내부에는 두개의 매개변수만 있는 추상메서드가 있음.
            // 그리고 여기의 정적 메서드 에는 두개의 매개변수로 뭐할지 정해져있지 않음.
         */

        Calculator add = (x, y) -> x + y;   // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 compute() 추상 메서드를 구현한 x + y 로 구현
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 3 = " + operate(2, 3, add));
        /*
            operate의 세번째 매게변수는 Calculator 인터페이스의 서브 클래스를 받음.
            그리고 operate() 메서드의 return 값은 기본적으로 compute()를 리턴하는 것을 알수있음.
            그런데 인터페이스는 추상 메서드밖에 없으니 구현부가 있는 객체값을 확인해야됨.
         */
        System.out.println(sub.compute(3,4));   // 그래서 얘는 객체를 통한 호출
        System.out.println(operate(4,5,mul));   // 정적 메서드를 통한 호출
        /*
            즉 클래스들 건의 일반 메서드 / 정적 메소드 뿐만 아니라 어디서 빠져나온 함수형 인터페이스의
            추상 메서드를 구현한 어떤 버전을 일반 표현식으로 썻든 람다식으로 썻든 다 해석해서
            어떻게 호출할지 까지 알 필요가 있다는 의미가 됨.
         */
    }
}
