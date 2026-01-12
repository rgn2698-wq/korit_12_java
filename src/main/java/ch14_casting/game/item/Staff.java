package ch14_casting.game.item;

public class Staff implements Weapon{
    @Override
    public void attack() {
        System.out.println("마법 구체를 던집니다!");
    }

    public void castSpell() {
        System.out.println("광역 마법을 시전합니다!");
    }
}
