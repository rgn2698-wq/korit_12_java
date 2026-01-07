package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        // Book 클래스의 인스턴스 생성
        Book book1 = new Book("자바의 정석", "남궁성");

        System.out.println("이 책의 제목은 " + book1.getTitle() + " 입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + " 입니다.");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        // showInfo() 호출
        book1.showInfo();

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // EBook 클래스의 인스턴스 생성
        EBook ebook = new EBook("스프링 입문", "이강준",
                                        "EPUB", 5.2);
        // setter 설정
        ebook.setFormat("PDF");     // 자식 클래스의 고유 메서드에 해당.

        // getter 출력
        System.out.println("이 전차책의 포맷은 " + ebook.getFormat() + "입니다.");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // showInfo() 호출
        ebook.showInfo();
    }
}
/*
    ch13.abstraction -> 패키지 abstract_classes 생성
    -> Factory / FactoryMain / PhoneFactory / TabletFactory 클래스를 생성하시오
 */