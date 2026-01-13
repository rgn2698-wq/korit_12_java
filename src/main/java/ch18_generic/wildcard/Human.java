package ch18_generic.wildcard;

public class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두 발로 뜁니다.");
    }
    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
/*
    Tiger 클래스에 가서 Animal 상속받고.
    호랑이가 네 발로 뜁니다. 라고 구현하시오.
    또한 hunt() 메서드를 정의하고
    호랑이가 사냥을 합니다. 라고 출력할수 있도록 작성하시오,

    Car 클래스는 Animal 상속을 받지않고
    move() 메서드를 통해 차가 움직입니다. 라고 정의하시오.
    또한 brake()를 통해
    차가 멈춥니다. 라고 정의하시오
 */