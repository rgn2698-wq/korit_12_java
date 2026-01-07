package ch13.abstraction.absrtract_classes;

public abstract class Factory {
    // field 선언
    private String name;

    // 추상 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();

    // getter / setter 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 고유 메서드 정의
    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}

