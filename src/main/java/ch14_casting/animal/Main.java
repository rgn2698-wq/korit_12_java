package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();   // 개가 짖습니다.
        dog1.fetch();       // 강아지가 공을 물어옵니다.

        // 업캐스팅 # 1
        Animal animal1 = dog1;
        animal1.makeSound();    // 개가 짖습니다. 즉, 재정의된 method가 호출 됨.
//        animal1.fetch();  // 이건 불가능

        // 업캐스팅 # 2
        Animal animal2 = new Dog(); // 이게 어제 말한 A a = new B(); 의 형태. 시험에 자주 나옴.
        animal2.makeSound();
//        animal2.fetch();  // 이것도 불가능
        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드. 즉 자식 클래스의 메서드가 호출됨(클래스B의 메서드라는 의미)
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능.

            그럼 재정의된 method 버전으로 호출이 될거라면 애초에
            클래스B 객체명 = new 클래스B(); 로 생성 해버리면 재정의된 method도 호출되고 고유 method도 호출
            할수 있으면 괜찮지 않냐는것
         */
        Animal animal0 = new Cat();
        animal0.makeSound();
        animal1.makeSound();

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal2 instanceof Dog;
        System.out.println(result2);

        // : 업 캐스팅이 이루어지지않고 그냥 Dog dog1 = new Dog(); 로 B b = new b(); 의 경우예시
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);        // true
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);        // true

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false

        System.out.println(" ↑ 업 캐스팅 파트: 객체명.메서드명(): 했을때 자기 버전이 나오는지 재정의 버전이 나오는지 주목");
        System.out.println(" ↓ 다운 캐스팅 파트");
        /*
            다운캐스팅은 명시적으로 이루어져야됨.
            방법
            (클래스명) 객체명; -> (int)1.23; 과 같은 방식임. conversion의 객체 버전이라고 생각할수있음
            그래서 기본 자료형의 항변환에서 벗어나서 참조 자료형까지 고려해야됨.
         */

        // 다운캐스팅 방법
        Dog dog2 = (Dog) animal2;
        // 위에 보면 Animal animal2 = new Dog();로 생성했기 때문에 animal2의 Dog 버전 객체명이 아예 없었음.
        // 근데 지금 다운캐스팅 하면서 dog2락고 하는 객체명을 지어줬다고 할수있음.
        animal2.makeSound();
        dog2.makeSound();
        dog2.fetch();
        /*
            dog2로 새로운 객체명을 선언하고 거기에 명시적 참조자료형 캐스팅을 적용하여 Animal 클래스의
            인스턴스인 animal2를 Dog 자료형으로 downcasting했음.
            근데 여기서 중요한건 다운캐스팅을 했다고 해서 animal2가 사라지는 것은 아님.
            dog2와 animal2가 별개로 움직인다고 봐야함.
            dog2로 메서드를 호출할 경우 당연히 재정의된 makeSound)가 출력되며,
            고유 메서드인 fetch() 역시 호출이 가능함.

            그러면 Dog dog0 = new Dog();로 만들면 애초에 재정의 된 메서드 및 고유 메서드를
            사용할 수 있다는 점이 문제가 됨.
         */
//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();
        /*
            이상의 경우를 확인했을때 dog3.makeSound();로 가기전에 이미 downcasting 부분에서 오류가
            발생 했음을 확인할수있음.
            즉 애초에 animal3를 생성할때 Animal클래스의 생성자를 호출해서 만들었기 때문에
            (A a = newA();이기 때문)
            하위 클래스의 인스턴스로 다운캐스팅 하는것이 불가능.
         */
        Animal animal4 = new Dog();
        // 와 같은 방식으로 선언된 클래스와 호출되는 생성자가 서로 달라야됨. (그리고 둘은 상속관계여야함)

        // 문제는 77번 라인에서 빨간줄 미리 띄워서 오류가 발생할 예정이라고 우리에게 알려주지 않았다는것.
        // 그래서 이를 해결하기 위한 것이 instanceof 연산자.

        System.out.println("animal4 검증");

        if (animal4 instanceof Dog) {       // 이 조건식이 true라면 animal4 생성시 호출된 생성자는 Dog();라는 의미
            animal4.makeSound();            // 그러므로 animal4.makeSound()를 호출했을때 결과값은 개가 짖습니다.
            // 만약 fetch도 호출하고 싶다면
            Dog dog4 = (Dog) animal4;
            dog4.fetch();
        } else if (animal4 instanceof Cat) {
            Cat cat0 =  (Cat) animal4;
            cat0.makeSound();
            cat0.udadada();
        }

    }
}
// ch14 하위에 (animal과 같은 수준에) centralcontrol
