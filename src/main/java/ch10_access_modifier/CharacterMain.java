package ch10_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 제어자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의.
    이를 CharacterMain 클래스에서 기능 테스트를 수행할겁니다.

    Character 클래스 설계
    1. field
        name - 캐릭터 이름 / 공개 가능
        health - 체력 / 읽기만 허용
        power - 공격력 / 같은 패키지만
        skill - 스킬명 / 지식 클래스만
        exp - 경험치 / 외부에서 완전 차단

        Character 클래스의 인스턴스인 warrior를 생성
        이름 : 전사
        체력 : 100
        공격령 200
        스킬 : 세로 베기
        exp 30
        으로 기본 생성자를 통해 생성하고, setter를 통하여 데이터를 설정하시오.
    2. method
        getHealth()
        attack() : 공격 시 콘솔창에                        call1()유형
            name이(가) power로 공격!
            name이(가) 경험치 amount을(를) 얻었습니다. ->라고 두줄 출력되게.
        heal() : 체력을 10 회복하고, 현재 체력 출력
            체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력될 수 있게)
        getExp(int amount) -> call2() 유형인데 경험치를 증가시키는 메서드(내부 전용)
            실행 예
            name이(가) 경험치 amount을(를) 얻었습니다. 라고 출력되게.
 */

class Character {

    // field 선언
    public String name;     // 공개가능
    private int health;     // 읽기 전용
    int power;              // 같은 패키지만
    protected String skill; // 상속을 받는 지식클래스 까지
    private int exp;        // 완전 차단

    // 기본 생성자


    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 30;
    }


    // setter 생성


    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    // getter 생성

    public int getHealth() {
        return health;
    }


    private void getExp() {
        this.exp += 10;
        System.out.println(name + "이(가) 경험치 " + 10 + "을(를) 얻었습니다!");

    }

    public void attack() {
        System.out.println(name + "이(가) " + power + "로 공격!");
        getExp();
    }

    public void heal() {
        this.health += 10;
        System.out.println("체력이 " + health + "회복 되었습니다. 현재 체력: " + this.health);
    }




}



public class CharacterMain {
    public static void main(String[] args) {

    //객체 생성
    Character warrior = new Character();

    warrior.setName("전사");
    warrior.setHealth(100);
    warrior.setPower(200);
    warrior.setSkill("세로 베기");
    warrior.setExp(30);
    // 이상의 setExp의 경우 객체 생성하고 나서 경험치를 설정할 수 있는데
        // 여기에 1000000 같은 식으로 입력하면 부정 사용이 될수 있습니다

    //warrior.gainExp(1000);    경험치를 얻는 메서드는 attack()메서드를


        // 메서드 호출 결과
        System.out.println("이름: " + warrior.name);
        System.out.println("체력: " + warrior.getHealth());

        warrior.attack();
        warrior.heal();


        Character healer = new Character("힐러", 100 ,"힐");
        System.out.println(healer.getHealth());

    }
}
