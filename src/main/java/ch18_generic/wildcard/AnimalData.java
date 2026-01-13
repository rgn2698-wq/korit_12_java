package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData의 field인 animal에 Animal 클래스의 상속을 받은 Tiger / Human객체를 field에 대입

        근데 T에는 어떠한 클래스도 들어갈수 있기 때문에 현재 상황에서는
        Car클래스의 객체도 animal에 들러갈수 있다고 해석할수 있음.

        이번 목표는
        특정 클래스라면(즉 Animal 클래스의 상속을 받은 서브 클래스라면
        해달 클래스에 있는 객체 정보를 출력하도록 작성함.
     */

    public void showData() {
        ((Animal)animal).move();   // 지금 보면 T에는 아무 클래스나
        // 들어갈수 있으므로 (Animal) 부분은 Animal로 형변환을 해줌
        if (animal.getClass() == Human.class) {
            ((Human)animal).read(); // 현재 field에 들어간 animal
            // 객체의 클래스를 확인하여 Human이라면 고유 메서드 read() 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        } else {
            System.out.println("아직 고유 메서드가 없거나 Animal의 서브클래스가 아닙니다.");
        }
    }
}
