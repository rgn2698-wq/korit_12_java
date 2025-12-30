package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        //아까전에는 myCar 객체를 생성하고 그 다음에 빨강이란 말을 color에
        //대입했습니다
        //근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할수없는건가
        //에 해당되는겁니다.
        // Car myCar = new car("빨강")
        Constructor constructor3 = new Constructor(3);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor("김사");
        // name은 필드/ 타이틀은 파라미터 / "김사"는 argument
        // 근데 필드를 네임으로 잡았을 때 매개변수를 네임으로 잡아버리면
        // this.name = name; 형태로 작성될겁니다.

        // 지시 사항 1
        System.out.println(constructor4.name);

        // 지시 사항 2
        Constructor constructor5 = new Constructor(5, "김오");
        System.out.println(constructor5.num);
        System.out.println(constructor5.name);

        // 지시 사항 3
        constructor5.displayInfo();
    }





    }

