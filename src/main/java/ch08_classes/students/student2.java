package ch08_classes.students;

public class student2 {


    int studentCode;
    String name;
    double score;

    public student2() {
    }


    public student2(int studentCode) {
        this.studentCode = studentCode;
    }


    public student2(String name) {
        this.name = name;
    }


    public student2(double score) {
        this.score = score;
    }

    public student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }


    public student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }


}
