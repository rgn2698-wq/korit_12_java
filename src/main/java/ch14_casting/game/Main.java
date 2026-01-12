package ch14_casting.game;

import ch14_casting.game.item.*;
import ch14_casting.game.system.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);

        System.out.println("ㅡㅡㅡㅡㅡㅡ무기획득ㅡㅡㅡㅡㅡㅡ");

        inventory.addWeapon(new Sword());
        inventory.addWeapon(new Staff());
        inventory.addWeapon(new Bow());

        System.out.println("ㅡㅡㅡㅡㅡㅡ전체공격ㅡㅡㅡㅡㅡㅡ");

        inventory.attackAll();

        System.out.println("ㅡㅡㅡㅡㅡㅡ특수능력ㅡㅡㅡㅡㅡㅡ");

        inventory.useSpecialAbilities();


    }
}
