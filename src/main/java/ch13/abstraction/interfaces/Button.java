package ch13.abstraction.interfaces;
/*
    클래스는 단일 상속만 가능한데 ,키워드는 extends
    인터페이스는 다중상속(구현)이 가능합니다. 키워드는 implements
 */
public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}     // 일반 메서드 입니다. {}가 있으니까. 근데 안에 아무것도 안했습니다.

    @Override
    public abstract void onPressed(); // 얘는 추상메서드로 만들겁니다.

    @Override
    public String onUp() {
        return "";
    }
}
