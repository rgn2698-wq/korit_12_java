package ch08_classes.students;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        // 기본 생성자로 만들었으니까 전체 필드에 값을 대입해야합니다.



        // 기본 생성자 사용
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;


        // int 매개변수 생성자 사용
        Student student2 = new Student(2025002);
        student2.name = "김이";
        student2.score = 100;


        // String 매개변수 생성자 사용
        Student student3 = new Student("김삼");
        student3.studentCode = 2025003;
        student3.score = 95.8;


        // int, String 매개변수 생성자 사용
        Student student4 = new Student(2025004, "김사");
        student4.score = 4.0;


        // studentCode, name, score 매개변수 생성자 사용
        Student student5 = new Student(2025005, "김오" ,80.7);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();


    }
}
