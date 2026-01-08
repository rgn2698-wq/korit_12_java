package ch14_casting.centralcontrol;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스를 연결합니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스를 연결 해제합니다.");
    }

    public void leftClick() {
        System.out.println("마우스 왼쪽 클릭");
    }
}
