package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor();
        System.out.println(constructor2.num);
        //아까전에는 myCar 객체를 생성하고 그 다음에 빨강이란 말을 color에
        //대입했습니다
        //근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할수없는건가
        //에 해당되는겁니다.
        // Car myCar = new car("빨강")
    }
}
