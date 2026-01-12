package ch17_static.singleton.factory;

public class Factory {
    private String FactoryName;

    public Factory(String FactoryName) {
        this.FactoryName = FactoryName;

    }

    // method 정의
    public SmartPhone produceSmartPhone(){
        System.out.println(FactoryName + " 에서 스마트폰을 생산합니다.");
        String model = "갤럭시S27";
        String serial;
        // 지역 변수로 Samsung객체를 생성
        // 그럼 계속 produceSmartPhone()을 호출하더라도
        // 이하의 객체가 계속 대입됨.
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model); // 갤럭시S27을 대입

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(),model,serial);

        return smartPhone;
    }
}
