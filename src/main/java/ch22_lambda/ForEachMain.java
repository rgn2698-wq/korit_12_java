package ch22_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과","딸기","블루베리");

        System.out.println(fruits);

        /*
            element를 추출하여 for 문 / 향상된 for문으로 작성하여 콘솔에 실행 예를 이하와 같이 작성
            과일명 : 사과
            과일명 : 딸기
            과일명 : 블루베리
         */
        System.out.println("--------- for 문 --------");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println("--------- 향상된 for 문 --------");
        for (String f : fruits) {
            System.out.println("과일명 : " + f);
        }

        // 람다식을 활용한 method For_
        fruits.forEach(fruit-> System.out.println("과일명 : " + fruits));
        System.out.println(fruits);
        fruits.stream().map(fruit -> "과일명 : " + fruits).forEach(System.out::println);
        System.out.println(fruits);

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums); // 일반 출력
        nums.forEach(num -> System.out.print((num+2) + " "));
        System.out.println(nums);   // 마찬가지로 forEach()는 nums라는 list 자체에 종속되어있기 때문에
        // 원본 자체가 변하는 것은 아님. 그냥 각각의 element에 대해 실행문을 적용하는 형태.
    }
}
