package ch09_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {

        // student1 -> 기본생성자 김일 / 1 / 3.3
        UnivStudent univStudent1 = new UnivStudent();
        univStudent1.setName("김일");
        univStudent1.setGrade(1);
        univStudent1.setScore(3.3);

        // student2 -> 기본생성자 김이 / 3 / -30 -> 실패하고 4.0 입력
        UnivStudent univStudent2 = new UnivStudent();
        univStudent2.setName("김이");
        univStudent2.setGrade(3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4.0);

        // student3 -> 기본생성자 김삼 / 5 -> 실패하고 2 / 2.7
        UnivStudent univStudent3 = new UnivStudent();
        univStudent3.setName("김삼");
        univStudent3.setGrade(5);
        univStudent3.setGrade(2);
        univStudent3.setScore(2.7);

        // student4 -> 기본생성자 김사 / 4 / 3.8
        UnivStudent univStudent4 = new UnivStudent();
        univStudent4.setName("김사");
        univStudent4.setGrade(4);
        univStudent4.setScore(3.8);

        // student5 -> 기본생성자 김오 / 2 / 1.0
        UnivStudent univStudent5 = new UnivStudent();
        univStudent5.setName("김오");
        univStudent5.setGrade(2);
        univStudent5.setScore(1.0);


        // showInfo() 사용
        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();
    }
}
