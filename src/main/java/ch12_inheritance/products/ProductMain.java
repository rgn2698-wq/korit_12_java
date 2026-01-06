package ch12_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        // Item 클래스 건드리지 말고 getter 이용해서 다음과 같은 출력물이 나오도록 작성 합니다.
        // 이 상품은 일반 상품입니다.
        // 이상품은 일반 카테고리 입니다.
        // System.out.println("이 상품은 일반 상품입니다.") // 이거 오답임

        // 다 하신 분들은
        /*
            Product 클래스의 인스턴스인 product1을 생성하는데
            이름 -> 전자제품
            카테고리 -> 가전 제품
            가격 -> 100000
            재고 -> 10 으로 생성하시오.
            setter 이용해서 가전 제품을 백색 가전제품으로 바꾸고,
            getter를 활용하여 해당 제품은 백색 가전제품입니다. 를 콘솔에 입력하세요.
         */

        Product item = new Product("일반 상품", "일반 카테고리", 0, 0);

        System.out.println("이 상품은 " + item.getName() + "입니다.");
        System.out.println("이 상품은 " + item.getCategory() + "입니다.");

        Product product1 = new Product("전자 제품", "가전 제품", 100000 , 10);

        product1.setCategory("백색 가전제품");

        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");
    }
}
