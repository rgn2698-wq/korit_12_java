package ch13.abstraction;

public abstract class Person {
    // field 선언
    private String name;
    // AllArgsConstructor
    public Person(String name) {
        this.name = name;
    }
    // method 예시
    public abstract void introduce();
}
