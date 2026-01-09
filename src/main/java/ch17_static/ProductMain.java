package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지않았지만 title 정적변수를
        // 불러올수 있음.
        // 롬복 사용시 : 클래스 레벨에 @Getter가 있더라도
        // 정적 변수 레벨에 추가적으로 @Getter를
        // 적용해야됨.
        System.out.println();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println();
        // 객체 생성
        Product product1 = new Product();
        product1.setName("아이스아메리카노");
        System.out.println(product1.getName());
        System.out.println("일반 필드 조회 : "+product1.getInstanceCnt());
        System.out.println("정적 필드 조회 : " + Product.getCnt());

        Product product2 = new Product();
        System.out.println("일반 필드 조회 : "+product2.getInstanceCnt());
        System.out.println("정적 필드 조회 : " + Product.getCnt());
        Product.setCnt(0);
        System.out.println("재고를 초기화했습니다. 현재 재고 : " + Product.getCnt());
        product1.increaseInstanceCnt();
        System.out.println(product1.getInstanceCnt());
    }
}
