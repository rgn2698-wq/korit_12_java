package ch18_generic.bmi;

public class Bmi {
    public double calcBmi(Person person) {
        double meter = person.getHeight() / 100.0;
        double bmi = person.getWeight() / (meter*meter);
        return bmi;
    }

    public void printResult(Person person, double bmi) {
        String stat;
        if (bmi < 18.5) {
            stat = "저체중";
        } else if (bmi < 23) {
            stat = "정상";
        } else if (bmi < 25) {
            stat = "비만전단계";
        } else if (bmi < 30) {
            stat = "1단계 비만";
        } else if (bmi < 35) {
            stat = "2단계 비만";
        } else {
            stat = "3단계 비만";
        }

        System.out.printf("%s 님의 키는 %.1f cm, 몸무게는 %.1f kg, bmi 지수는 %.2f 으로 %s입니다.",
                person.getName(),
                person.getHeight(),
                person.getWeight(),
                bmi,
                stat);
    }
}
