package ch10_access_modifier;
// 이하의 클래스는 default가 생략.
class AccessModifierExample {   // 간판 클래스는 public이 명시돼야 함.
    // field 선언                - 필드긴 한데, 선언 및 초기화하겠습니다. 처음보는 예시입니다.
    public int publicVar = 10;
    protected int protecedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }
}

public class Main {
    public static void main(String[] args) {
        // 객체 생성 : default class니까 객체 생성이 가능
        AccessModifierExample example = new AccessModifierExample();
        // field 조회
        System.out.println(example.publicVar);
        System.out.println(example.defaultVar);
        System.out.println(example.protecedVar);
        //System.out.println(example.privateVar);   // private 접근 제어자 이기때문에 오류발생. field의 직접 조회 불가능.
        System.out.println(example.getPrivateVar());



    }
}
