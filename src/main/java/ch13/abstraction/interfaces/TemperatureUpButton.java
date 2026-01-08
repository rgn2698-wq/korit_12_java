package ch13.abstraction.interfaces;

public class TemperatureUpButton implements Press{

    @Override
    public void onPressed() {
        System.out.println("온도를 한칸 올립니다.");
    }

    @Override
    public String onUp() {
        System.out.println("온도를 계속 올립니다...");
        return " ";
    }
}
