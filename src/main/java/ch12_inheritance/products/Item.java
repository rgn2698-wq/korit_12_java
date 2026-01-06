package ch12_inheritance.products;
/*
    부모 클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain

    Item 클래스에
    1. field 선언 private String name / private String category
    2. AllArgsConstructor 생성
    3. Setter / Getter 생성
    4. Product 에서 상속하시오.

    Product 클래스에
    1. field 선언 private in price; / private int stock
    2. AllArgConstructor 생성
    3. 고유 field에 대한 Setter / Getter 생성
 */
public class Item {

    // field 선언
    private String name;
    private String category;

    // AllArgConstructor 생성
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Setter / Getter 생성

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
