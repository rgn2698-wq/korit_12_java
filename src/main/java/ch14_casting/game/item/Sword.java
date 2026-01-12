package ch14_casting.game.item;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("검을 크게 휘두릅니다!");
    }

    public void parry() {
        System.out.println("검으로 적의 공격을 막아냅니다!");
    }


}
