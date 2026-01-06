package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        // Book 클래스의 인스턴스 생성
        Book book1 = new Book("자바의 정석", "남궁성");
        // showInfo() 호출
        book1.showInfo();



        // EBook 클래스의 인스턴스 생성
        EBook book2 = new EBook("스프링 입문", "이강준",
                                        "EPUB", 5.2);
        // setter 설정
        book2.setFormat("PDF");

        // getter 출력
        System.out.println("이 전차책의 포맷은 " + book2.getFormat() + "입니다.");
        System.out.println();

        // showInfo() 호출
        book2.showInfo();
    }
}
