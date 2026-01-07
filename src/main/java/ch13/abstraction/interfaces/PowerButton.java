package ch13.abstraction.interfaces;

public class PowerButton extends Button{
    // field 선언
    private boolean status;

    @Override
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("전원을 끕니다.");
        } else  {
            status = !status;
            System.out.println("전원을 켭니다.");
        }
    }
}
