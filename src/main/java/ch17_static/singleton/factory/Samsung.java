package ch17_static.singleton.factory;

import ch17_static.singleton.product.ProductView;
import lombok.Getter;

/*
    방금 작성한 ProductView의 인터넷 에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱글톤 패턴을 작성하시오.
 */
@Getter
public class Samsung {
    // 정적 필드
    private static Samsung instance;
    // 일반 필드
    private String company;
    private int serialNumber;

    private Samsung() {
        company = getClass().getSimpleName();   // 결과값 Samsung
        serialNumber = 20260000;

        System.out.println("삼성 객체가 생성 되었습니다.");
    }

    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    // 일반 메서드
    public String createSerialNumber(String model){
        return model + " - " + ++serialNumber;
    }
    /*
        객체가 하나만 생성될꺼라는걸 알고있는상태
        그런데 이걸 호출했을때 ++가 적용은 되겠지만 다수의 객체를
        만들려고 시도 해봤자 하나만 만들어짐
        모델명=20260000 에서 1씩 증가된 값이 시리얼 넘버가 됨.
     */

    /*
        정적 변수로 serialNumber를 선언하지 않고 일반 field를 선언안 이유는 그냥 객체 하나만 생성 된다고
        보여주기 위함.
        이미 static 개념을 배우고 이애한 사람들이 떠올릴 수 있는 의문이므로 이런 질문이 떠오른다면
        학습이 올바르게 되고 있는 중.
     */












}
