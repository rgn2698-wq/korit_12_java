package ch08_classes;
/*
    생성자
        생성자는 객체가 생성될 때 호출되는 특별한 '메서드'
    객체 생성 예시
    클래스명    객체명 = new 클래스명();
    ClassExample example = new ClassExample();
    :사실 ClassExample() 가 생성자에 해당됩니다.

    특징:
        1. 클래스의 이름과 생성자의 이름은 동일하다.
         (다른 메서드들과 달리 Pascal Case로 작성되고.
         그리고 아까 수업에서 들었다는 method는 동사로 시작되는데.
         얘는 클래스 이름이랑 똑같으니까 명사겠네요)
        2. return 값이 없습니다. -> call1(), call2() 유형으로 생각할 수 있음.
        3. 객체 초기화 : 생성자는 객체의 필드 '초기화'를 담당한다.

    생성자 정의 방식 :
        1. 기본 생성자 : 매개변수가 없는 생성자
          (근데 얘는 클래스를 만들 때 default로 생성되기 때문에 정의하지않아도
          될때가 많습니다. 저희가 Car()어쩌고 메서드를 만들지않았죠)
          즉, default로 생성된 기본 생성자를 이용하여 객체를 생성했습니다.
        2. 매개변수 생성자: 하나 이상의 메게변수를 가지는 생성자

 */
public class Constructor {
    // 필드 선언
    int num;
    String name;
    /*
        기본 생성자 정의 -> 언래 default로 만들어집니다.
        그리고 매개변수의 유무만 있고 리턴이 없어서 call1() / call2() 우형밖에 없죠
        그 말은 어차피 리턴없어서 보이드니까 보이드를 명시하지않ㅅ급니다.
        그리고 기본생성자는 매개변수가없으니까 메소ㅓ드 적으로는 call1()
        유형에 해당합니다,
     */

    public Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    //매개변수 생성자
    public Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체됨.




        }

    public Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }

    public Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(int, String 전부를 매개변수로 요구하는 생성자)");
        this. num = num;
        this. name = name;
    }

    public void displayInfo() {
        System.out.println(name + "학생의 번호는" + num + "번입니다.");
    }

    /*
        지시 사항 # 1
        String title을 매개변수로 하는 생성자를 정의하고,
        RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 constructor4라는 객체명을 지니고, title에 "김사"으로
        이름 붙이고 객체를 생성한 후,
        System.out.println(contructor4.name);을 입력하여 콘솔에 "김사"를 출력하시오.

        지시 사항 # 2
        int num, String name을 매개변수로 하는 생성자를 정의하고
        AllArgsConstructor(int, String 전부를 매개변수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 constructor5라는 객체명을 지니고, 5, "김오"라고
        값을 대입한 객체를 생성한 후
        south(constructor5.num);
        south(constructor5.name);
        을 출력하시오.

        지시 사항 #3
        Car.java 파일 내에 있는 displayinfo() 메서드를 참조하여
        constructor5.displayinfo();를 호출했으경우
        김오 학생의 학번은 5번 입니다.
        를 콘솔에 출력할 수 있도록 Constructor.java에 displayinfo()메서드를 call1()
        유형으로 작성하고
        ConstructorMain에서 호출하시오.
     */
}
