package ch09_getter_setter.univ_student;

public class UnivStudent2 {

    String name;
    int grade;
    double score;

    public UnivStudent2(String name) {
        this.name = name;
    }

    public UnivStudent2(int grade) {
        this.grade = grade;
    }

    public UnivStudent2(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
