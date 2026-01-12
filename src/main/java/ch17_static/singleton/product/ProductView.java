package ch17_static.singleton.product;

public class ProductView {
    // 정적 변수 선언 -> field
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance가 됨.
    // -> 24년 1회 실기 시험시 field 명도 힌트였음.
    private static  ProductView instance;
    public static int count = 1;

    // 생성자
    private ProductView(){
        int cnt = 1;        // 객체 생성에 사용되는 field
        System.out.println(cnt + "번째 객체 생성");
        cnt++;
        System.out.println("정적 변수를 사용하는 " + count + "번 째 객체 생성");
        count++;
    }

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }




}
