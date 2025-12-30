package ch08_classes.products;
/*
    Product 클래스에 여러 가지 생성자를 정의하시오.
    field는
    int productNum;
    String productName;

    method는
    showInfo() -> productNum과 productName 정보가 콘솔에 출력되도록할것

    1. 기본 생성자를 사용하여 객체를 생성하시오.
    product1
    productNum 123456
    productName LG엘패드
    2. 시리얼 넘버를 기본으로하는 매개변수 생성자를 통해 객체를 생성하시오.
    product2
    productNum 987654
    productName 다이소충전기
    3. 제품명을 기본으로 하는 매개변수 생성자를 통해 객체를 생성하시오.
    product3
    productNum 159357
    productName USB-C 케이블
    4. AllArgsConstructor를 이용하여 객체를 생성하시오.
    product4
    productNum 951753
    productName GFlip6

    5. 정보를 출력하는 showInfo() (call1()유형으로 정의할 것)의 콘솔창
    결과는 이하와 같습니다.

    실행 예 :
    시리얼 넘버 : 951753
    제품 타이틀 : GFlip6

    6. 각 객체에 대해서 showInfo()를 호출할 것.
 */
public class Product {

    int productNum;
    String productName;


    // 기본 생성자
    public Product() {
        System.out.println("기본 생성자 생성");
    }



    // 시리얼 넘버 기본 매개변수
    public Product(int productNum) {
        this.productNum = productNum;
    }

    //제품 명 기본 매개변수
    public Product(String productName) {
        this.productName = productName;
    }

    // AllArgsConstructor를 이용한 객체 생성
    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    // 5번 해답
    public void showInfo() {
        System.out.println("시리얼 넘버: " +  productNum + "\n 제품 타이틀 " + productName);

    }
}

