package ch08_classes;

public class Car {

    // 필드선언
    String color;
    int speed;
    //메서드 정의
    public void drive() {
        System.out.println(color + "자동차가"
        + "주행중입니다.");
    }
    public void brake() {
        System.out.println(color + "자동차가"
        + "멈췄습니다.");
    }
    public void displayInfo() {
        System.out.println(" 이 차의 색깔은 " +
                color + "색이고,");
        System.out.println("최고 속도는 " + speed
        + "km/h입니다.");
    }

    /*
        Car의 인스턴스인 myCar라는 객체를 생성하시오.
        Color 빨강, speed에 160을 대입하시오.
        yourCar에 노랑, 180을 대입하시오.
        myCar는 dirve() 메서드를 호출
        yourCar는 brake() 메서드를 호출
        myCar, yourCar에 각각 displayInfo() 메서드를 호출하시오.
     */


}
