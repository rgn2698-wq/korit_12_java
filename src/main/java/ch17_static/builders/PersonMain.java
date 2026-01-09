package ch17_static.builders;

import java.util.zip.ZipError;

public class PersonMain {
    public static void main(String[] args) {
//        Person person = new Person();
        /*
            private Person(Builder builder)로 정의한 매개변수 생성자만 있으니 기본 생성자가 없다는 점에서 모두 발생
            그리고 private 접근 제어자 때문에 () 내에 Builder 객체를 집어 넣는다해더 오류 발생
         */
        Person person1 = new Person.Builder().age(11).address("부산광역시 부산진구").name("김일").build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().name("김삼").build();
        System.out.println(person3);

        Person2 person4 = Person2.builder().name("김삿갓").build();
        System.out.println(person4);

        Person2 person5 = Person2.builder().build();
        System.out.println(person5);

        Person2 person6 = Person2.builder()
                .age(15)
                .address("서울광역시 종로구")
                .name("김육")
                .build();
        System.out.println(person6);

    }
}
