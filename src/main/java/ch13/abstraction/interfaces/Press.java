package ch13.abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface이기 때문에 변수 앞에 뭐 궅이 접근 제어자 명시 할 필요x
        final 키워드도 적을 필요가 없습니다.
        하지만 기본적으로 public final이 생략되어있습니다
        그래서 String옆에 final을 적더라도 인텔리제이상에서 불필요하다고
        안내가 나옵니다

        이하는 안되는 예시들.
     */
//    int age; // 객체마다 다른 값을 적용하기 위한 field선언 불가는 초기화가 필수 -> 상수까지
//    public  Press() {}; // 생성자 정의 불가능 -> 객체 생성을 할수없음
//    void popOut() {
//        System.out.println("일반 메서드를 정의할수없습니다.");
//    } // 인터페이스 상에서는 추상 메서드만 가능. 추상 메서드
    //

    // 접근예기
    void onPressed();     // 이거 call1() ~ call4() 중에

    String onUp();

    /*
        Up interface 를 생성하고 onUP() 이라는 추상 메서드를 정의하시오 -> call1()
        Down interface 를 생성하고 onDown() 이라는 추상 메서드를 정의하시오 -> call1()
     */


}
