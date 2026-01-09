package ch15_objects;

public class ObjectTest {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름: " + name + "\n주소 : "+ address);
    }

    @Override
    public String toString() {
        return  "이름: " + name + "\n주소:" + address + ".";
    }

    /*
        objectTestMain 클래스에
        object1 객채를 기본생성자를 통해 생성하고 이름에 김일 / 주소에 부산광역시 연제구를 입려학고
        showInfo()를 호출하시오

        object2 객채를 AllArgsConstr를 통해생성하고 이름에 김이 / 주소에 서울특별시 종로구를 입력하고
        showInfo()를 호출하시오
     */
}
