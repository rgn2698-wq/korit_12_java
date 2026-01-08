package ch14_casting.centralcontrol;

public class Airconditioner implements Power {
    @Override
    public void on() {
        System.out.println("에어컨을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨을 끕니다.");
    }


    // 고유 메서드 정의(downcasting을 위해서)
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿉니다.");
    }

}
