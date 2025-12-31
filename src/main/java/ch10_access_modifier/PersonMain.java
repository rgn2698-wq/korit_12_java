package ch10_access_modifier;


class Person {
    private String name;
    // field를 private 접근 제어자/지정자/제한자로 사용한다는
    // 것은 -> main단계에서 객체를 생성하고, 그 객체의
    // field에 값을 객채명, 속성명 = 데이터; 를 통해서
    // 바꿀 수 없다는 것을 의미합니다.
    // 그렇다면 앞으로는 setter /getter를 통해서
    // field 값을 설정 및 조회해야한다는 것을 의미함.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 5) {
            System.out.println("글자 수 제한을 넘어섰습니다.");
            return;
        }
        this.name = name;
        System.out.println("이름이 " + name + "로 설정 되었습니다.");
    }
}
/*
    CharacterMain -> Character 클래스 만들고
    setter/ getter는 default로 access modifier가
    public으로 생성 되었습니다.

    PersonMain클래스에서 person1 객체를 생성하고
    setter / getter를 통해서 처음 이름을 "김일"로 초기화하고.
    그 이름을 콘솔에 출력합니다.
    다시 이름을 "브래드피트"로 수정하면 "글자 수 제한을 넘어었습니다."라는 -> 4자 초과면 메서드 종료
    안내문이 출력되면서 메서드를 종료시키고
    "이일"로 수정할수있도록 setter를 설정하시고
    getter를 통해서 조회할때
    현재이름 : 이일
    로 나올수있도록 작성하시오.

    실행 예
    이름이 김일 로 설정되었습니다.
    글자수 제한을 넘어었습니다.
    이름이 이일로 설정되었습니다.
    현재 이름 : 이일
 */



public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setName("브래드피드");
        person1.setName("이일");
        String name = person1.getName();
        System.out.println("현재 이름 : " + name);
    }
}
