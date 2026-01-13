package ch19_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Strlist {
    public static void main(String[] args) {
        // Array와의 차이점 # 1
        // 선언 방식
        String[] strArray = new String[5];   // 배열 선언 및 초기화
        List<String> strList = new ArrayList<>();   // List 선언 방식 및 초기화

        // Array와의 차이 점 # 2 - 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List -> method를 경유해야 함.
        strList.add("Java");
        strList.add("python");
        strList.add("JavaScript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장되어 있기 때문에 집어넣은 순서대로 값이 들어감.
        // 그리고 최초에 List의 방의 개수를 정하지않았지만 알아서 방이 늘어남.

        // Array와의 차이점 # 3 - 출력 방식
        // strArray를 출력만 하시오.
        System.out.println(Arrays.toString(strArray));
        // List의 출력
        System.out.println(strList);

        // Array와의 차이점 # 4 - 삭제 방식
        strArray[0] = null;
        // 그런데 List는 생각햅면 인덱스 넘버가 딱 고정이지도 않음.
        String removeElem1 = "JavaScript";
        boolean isRemoved = strList.remove("JavaScript");
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        System.out.println(strList);
        // 이상의 경우 차이점은 Array의 경우 null값 대입이기 때문에
        // 0번지가 아니고 null이고 여전히 5개의 방을 가지고있음
        // 근데 list의 경우 삭제하니 방이 4개로 줄어듬을 확인할수있음

        // 정렬 방법
        // 배열은 Arrays.sort였음
        Collections.sort(strList);
        System.out.println(strList);
        // 내림차순
        Collections.sort(strList, Collections.reverseOrder());
        strList.addAll(strList);
        /*
            특정 element의 검색(List내외) -> .contains() 메서드 사용
            리스트명.conrains(목적어)
         */
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + "포함 여부 :" + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + "포함 여부 :" + contains2);
        /*
            이상의 이유는 List는 element가 명확하게 일치하는 지를 확인함.
            그래서 py는 python이라는 String 데이터의 일부이기는 하지만 element 전체를
            의미하는 것은 아니기 때문에 false 결과값이 나오게 됨.

            strArray에 김0 김1 김2 김3 김4 로 집어넣으시오.
            strArray를 일반 for문으로 출력하고 그 결과가 김0 님 / 김 1 님 ... 김4 님 /
            으로 결과 값이 나오도록 작성하시오.
            strArray를 향상된 for문으로 작성하고 김0 학생 - 김1 학생 ... 김4 학생 -
            으로 결과 값이 나오도록 작성하시오
         */

        for (int i = 0 ; i < strArray.length ; i++) {
            strArray[i] = "김" + i;
        }

        for (int i = 0; i < strArray.length ; i++) {
            System.out.print(strArray[i] + " 님 / ");
        }
        System.out.println();

        for (String str : strArray) {
            System.out.print(str + " 학생 - ");
        }

        // Listㄴㄴ index 추출할 때 리스트명.size()를 씀. .length 아니고, method인 점 주의

        // 그러면 일반 for문으로 strList를 Java 언어 python 언어 ... 등으로 출력하시오
        // 향상된 for문으로 Java 공부 / python 공부 / ... 등으로 출력하시오.
        System.out.println();
        for (int i = 0; i < strList.size() ; i++) {
            String lang = strList.get(i);
            System.out.print(lang + " 언어 ");
        }
        System.out.println();
        for (String s :strList) {
            System.out.print(s + " 공부 / ");
        }

        /*
            이상의 경우에서 배열일때는 구경도 못하는 향상된 for문의 장점이 있는데
            내부의 index지점을 .length를 쓰는지 .size()를 쓰는 지 등을 고려하지않아도
            된다는 점과, 출력할때 [] 인덱스 넘버를 사용해야하는지 .get()을 사용해야 하는지
            여부 등을 따지지않아도 된다는 것임.
         */
    }
}
