package ch12_inheritance;

public class Tiger extends Animal {
    // 자식 고유의 field 정의
    private double weight;

    public Tiger() {
    }

    public Tiger(String animelName, int animalAge, double weight) {
        super(animelName, animalAge);       // 여기서도 super 키워드가 있습니다.
        this.weight = weight;
    }

    // getter / setter 설정
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 자식 클래스의 고유 메서드 정의
    public void hunt() {
        System.out.println(getAnimelName() + "이(가) 사냥을 합니다.");
    }

    public void weight() {
        System.out.println(getWeight() + "t 입니다.");
    }


    @Override
    public void move() {
        System.out.print("호랑이가 ");
         super.move();    // super.메서드명(); / super - 부모 클래스의 임의의 인스턴스를 의미함.
        // @Override가 되어있는 부분은 상위 클래스로 부터 상속 받은 메서드임을 의미함.
        // 그러니까 얘가 아예 없으면 고유 메서드라는 뜻일 것이고.
        // 클래스에 없는 메서드를 호출한다면 부모 클래스의 메서드를 '그대로' 쓰는 거고
        // @Override가 있다면 부모클래스의 메서드를 호출하긴 하는데.
        // '재정의' 가 되어있다고 볼 수 있음.

        // Tiger 클래스에서 기본 생성자 및
        // 모든 field를 다 사용하는 생성자를 정의 하시오.


    }



    // 고유 메서드 overload
    public void hunt(String prey) {
        System.out.println("");


    }
}
