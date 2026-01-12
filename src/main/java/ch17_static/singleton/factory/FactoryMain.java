package ch17_static.singleton.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1 공장");
        Factory factory2 = new Factory("제 2 공장");
        Factory factory3 = new Factory("제 3 공장");
        Factory factory4 = new Factory("제 4 공장");

//        SmartPhone smartPhone1 = new SmartPhone("임의의 공장", "임의의 스마트폰 객체","임의 넘버");
//        System.out.println(smartPhone1);

        // 공장을 붙이지 않고 스마트폰 객체를 생성할수있음
        // 이상의 이유 @AllArgsConstruction을 적용. 기본적으로 public이기 때문.
        // 그래서 @AllArgsConstruction(access = AccessLevel.PACKAGE)로 수정해주면 11번 라인이 오류발생

        SmartPhone phone1 = factory1.produceSmartPhone();
        SmartPhone phone2 = factory2.produceSmartPhone();
        SmartPhone phone3 = factory3.produceSmartPhone();
        SmartPhone phone4 = factory4.produceSmartPhone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
    }

}

/*
    이상의 코드를 실행시켰을때 알수있는건
    어떤 공자에서 메서드를 호출했는가와는 상관없이
    crearSerialNumber()메서드를 호출한 결과가 단일한 Samsung 객체에서
    비롯된다는 것을 알수있음.
    그래서 다수의 공장 객체에서 각각 produceSmartPhone() 메서드를
    호출하더라도 일원화된 시리얼 넘버 부여가 가능.
 */
