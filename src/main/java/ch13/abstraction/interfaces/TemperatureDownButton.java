package ch13.abstraction.interfaces;

public class TemperatureDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다...");
    }
}
