package ch13.abstraction.absrtract_classes;

public class PhoneFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println("모바일폰 공장 : " + this.getName() + "에서 " + model + " 을(를) 생성합니다.");
    }

    @Override
    public void manage() {
        System.out.println("모바일 폰 공장을 관리합니다.");
    }

}
