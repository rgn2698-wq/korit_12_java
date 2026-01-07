package ch13.abstraction;

public abstract class Student extends Person {
    // 서브 클래스의 고유 field 선언
    private String school;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void introduce() {

    }
}
