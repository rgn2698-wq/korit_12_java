package ch09_getter_setter;

public class PersonMain {
    public static void main(String[] args) {

    Person person1 = new Person();
    //field에 값을 직접 대입하는 방법
    person1.name = "김일";
    person1.age = -10;
    person1.address = "부산광역시 부산진구";

    // setter를 경유하여 field에 값을 대입하는 방법
    // setter는 method이므로
    person1.setName("김일일");
    person1.setAge(-100);
    person1.setAddress("서울특별시 종로구");

    // getter를 적용하여 field를 조회하는 방법
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());

        // 여기서 getter만을 사용하여
        // 김일일 학생의 나이는 0 살이고 주소는 서울특별시 종로구 입니다. 라고 출력하도록 작성하시오.

        System.out.println(person1.getName() + "학생의 나이는");
        System.out.println(person1.getAge() + " 살 이고 주소는 ");
        System.out.println(person1.getAddress() + " 입니다.");

        // String / Scanner 등은 class에 해당됩니다. 그런데 우리는 이미 class를 배웠으니까
        // 거기에 method들이 딸려있다는 것을 알 수 있습니다.
        // 그리고 field도 있겠네요

        int lengthOfName = person1.getName().length();  //chaining method
        System.out.println(lengthOfName);

        // chaining method 를 잘 적용하려면 특정 메서드의 결과값이 어떻게 되는가를 아는것이 매우 중요.

        /*
            setName() 메서드에 비지니스 로직을 추가하시오.
            1. argument로 들어온 String 데이터의 글자 수를 파악하여
            2. 4글자 초과라면 "변경할 수 없습니다."를 출력한 후에 기존이름을 그대로 사용할것.
            3. 4글자 이하라면 "이름이 변경되었습니다."
                            "변경 전 : 김일일"
                            "변경 후 : 김일이"
            4. 이 되도록 작성하고, PersonMain에서 person1의 이름을 setter를 통해 변경하시오.
            5. 이상의 코드를 작성했을 때의 실행 예는 이하와 같습니다.
            변경할 수 없습니다. -> 이때 setName("디카프리오");를 적용하시오.
            이름이 변경되었습니다.
            변경 전 : 김일일
            변경 후 : 김일이
         */
        person1.setName("디카프리오");
        person1.setName("김일이");

    }
}
