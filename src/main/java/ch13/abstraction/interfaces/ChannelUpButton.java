package ch13.abstraction.interfaces;

public class ChannelUpButton implements Press {
    @Override
    public void onPressed() {
        System.out.println("채널을 한칸 올립니다.");
    }
    
    @Override
    public String onUp() {
        System.out.println("채널을 계속 올립니다...");
        return "";
    }
}
