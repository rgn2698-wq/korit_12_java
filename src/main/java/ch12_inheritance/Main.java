package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.move();
        animal1.setAnimelName("동물");
        animal1.setAnimalAge(13);

        // Animal 클래스의 지시사항을 완료하시오, Tiger클래스
        Tiger tiger1 = new Tiger();
        tiger1.setAnimelName("호랑이");
        tiger1.setAnimalAge(1);
        System.out.println("이 호랑이의 이름은"
                    + tiger1.getAnimelName() + " 이고, 나이는"
                    + tiger1.getAnimalAge() + "살 입니다.");
        tiger1.move();
        tiger1.hunt();
        tiger1.hunt("사료");
//        animal1.hunt(); <- 부모 클래스는 자식 클래스의 메서드를 호출 할수없음.
        tiger1.setWeight(1.4);
        System.out.println(tiger1.getAnimelName() + "의 몸무게는 " + tiger1.getWeight() + "t 입니다.");

        System.out.println("-----------------------------------------------------------------------");

        // tiger1에 몸무게를 1.4로 입력하고
        // 호랑이의 몸무게는 1.4t입니다.
        // 라고 출력하시오.

        Human human1 = new Human();
        human1.move();
        human1.setAge(28);
        human1.setName("아무개");
        human1.setRead("자바의 기초");
        System.out.println("안녕하세요, 제 이름은 " + human1.getName() + "이고 나이는 "
                        + human1.getAge() + "살 입니다. 내년에는 " + (human1.getAge()+1) + "살이 됩니다.");
        System.out.println(human1.getName() + "이(가)" + human1.getRead() + "를 읽는 중입니다.");
    }
}
