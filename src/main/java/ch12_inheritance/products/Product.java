package ch12_inheritance.products;
/*
    지금 작성하는 부분의 경우 github에 완전판이 올라가기 때문에
    왜 오류가 발생하는지, 어떻게 검증하는지 어려움을 겪을수 있습니다.

    부모-자식의 상속관계가 성립되어 있을때,
    부모 클래스에서 기본 생성자 없이 매개변수 생성자만 있다면
    자식 클래스에서 완벽한 기본 생성자를 만드는 것이 '불가능'합니다.

    자식 클래스의 객체를 생성시 필수적으로 '부모 클래스의 생성자를 호출'하기 때문입니다.
    자식 클래스에서 정의되지않은 일부 필드와 메서드를 어떻게 사용할수 있냐면
    부모 클래스의 객체를 생성한 다음에 자식 클래스에서 고유 필드와 메서드를
    더하여 합치는 과정을 거치기 때문입니다.

    그래서 부모 클래스의 생성자 정의 방식을 따르지않으면
    자식 클래스에서 오류가 발생하는 경우가 있습니다.

    또한 어떤 객체를 생성할 때 저희는
    A a = new A(); 방식으로 생성해왔는데 앞으로는
    A a = new B(); 같은 방식으로 생성하는 내용이 있을 겁니다. -> 정처기 단골문제
 */
public class Product extends Item {

    // field 선언
    private int price;
    private int stock;

    // AllArgConstructor 생성
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    // 고유 field에 대한 Setter / Getter 생성
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

