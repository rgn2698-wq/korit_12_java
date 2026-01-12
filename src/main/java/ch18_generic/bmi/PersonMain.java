package ch18_generic.bmi;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일", 60, 170);

        Bmi calc = new Bmi();

        double result1 = calc.calcBmi(person1);

        calc.printResult(person1,result1);


    }
}
