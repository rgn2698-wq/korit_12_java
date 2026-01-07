package ch13.abstraction.interfaces;

public class VolumeUpButton implements Press{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 한칸 올립니다.");
    }

    @Override
    public String onUp() {
        System.out.println("볼륨을 계속 올립니다...");
        return "";
    }
}
