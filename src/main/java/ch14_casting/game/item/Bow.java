package ch14_casting.game.item;

public class Bow implements Weapon{
    @Override
    public void attack() {
        System.out.println("화살을 날립니다!");
    }

    public void snipe() {
        System.out.println("멀리 있는 적을 저격합니다!");
    }
}
