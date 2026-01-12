package ch14_casting.game.system;

import ch14_casting.game.item.*;    // 하위에 있는 모든 클래스를 읽어내는 기호 : *

public class Inventory {
    private Weapon[] weaponslots;

    public Inventory(int slot) {
        this.weaponslots = new Weapon[slot];
    }

    public void addWeapon(Weapon weapon) {
        for (int i = 0; i < weaponslots.length; i++) {
            if (weaponslots[i] == null) {
                weaponslots[i] = weapon;
                System.out.println((i + 1) + "번 슬롯에 무기를 장착했습니다.");
                return;
            }
        }System.out.println("인벤토리가 가득 찼습니다");
    }


    public void attackAll() {
        System.out.println("???를 향해 전체공격!");
        for (int i = 0; i < weaponslots.length; i++) {
            if (weaponslots[i] != null) {
                weaponslots[i].attack();
                continue;
            }
            System.out.println("무기를 장착하고 있지 않습니다.");
        }
    }


    public void useSpecialAbilities() {
        System.out.println("??? 를 향해 특수스킬을 시전!");
        for (Weapon w : weaponslots) {
            if (w != null) {
                if (w instanceof Sword) {
                    Sword sword =  (Sword) w;
                    sword.parry();
                }
                else if (w instanceof Staff) {
                    Staff staff =  (Staff) w;
                    staff.castSpell();
                }
                else if (w instanceof Bow) {
                    Bow bow =  (Bow) w;
                    bow.snipe();
                }
            }
        }
    }


}
