package ch08_classes.products;

public class ProductMain {
    public static void main(String[] args) {

        Product product1 = new Product();


        // 1번 해답
        product1.productNum = 123456;
        product1.productName = "엘지엘패드";
        product1.showInfo();

        // 2번 해답
        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";
        product2.showInfo();

        // 3번 해답
        Product product3 = new Product(159357);
        product3.productName = "USB-C 케이블";
        product3.showInfo();

        // 4번 해답
        Product product4 = new Product(951753, "GFlip6");
        product4.showInfo();


    }
}
