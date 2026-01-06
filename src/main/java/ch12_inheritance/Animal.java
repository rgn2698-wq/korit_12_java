package ch12_inheritance;
/*
    상속을 지시하는 키워드 extends
 */
public class Animal {
    // field 정의
    private String animelName;
    private int animalAge;

    // 기본 생성자 하나, 매개 변수 생성자 하나짜리 두 개

    public Animal() {
    }

    public Animal(String animelName) {
        this.animelName = animelName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }


    // AllArgsConstructor 생성자 하나 생성하시오.

    public Animal(String animelName, int animalAge) {
        this.animelName = animelName;
        this.animalAge = animalAge;
    }

    // Getter / Setter 생성하시오.


    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimelName() {
        return animelName;
    }

    public void setAnimelName(String animelName) {
        this.animelName = animelName;
    }



    // Animal 클래스의 고유 메서드 정의
    public void move() {
        System.out.println("움직입니다.");
    }
}




