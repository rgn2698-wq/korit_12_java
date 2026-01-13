package ch19_collections;

import java.util.*;

/*
    List는 순서가 잇고 중복 허용
    Set은 순서는 없고 중복은 허용하지않기 때문에
    List -> Set 혹은 Set -> List 로의 형변환이 중요.
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복을 제거
    하여 후보군만 남기는 등의 형태로 사용할수 있음
    또한 SEt으로 중복을 제거한 후에 다시 List로 돌려서
    .get(인덱스넘버)로 조회도 할수있음.
    Set은 순서가 없기때문임.

    그래서 Set은 중1때 학습하는 집합 개념과 유사함.
    다만 집합은 숫자로만 이루어졌던 반면에
    Set은 다양한 자료형을 기준으로 만들수 있음.
 */
public class StrSet {
    public static void main(String[] args) {
        // set 객체 생성
        Set<String> strSet = new HashSet<String>();
        // List도 생성 (형변환 중요)
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일 .add(element)
        strList.add("java");
        strList.add("python");
        strList.add("C");
        strList.add("C++");
        strList.add("C#");
        strList.add("SpringBoot");
        strList.add("SpringBoot");
        strList.add("SpringBoot");

        // Set의 출력
        System.out.println(strSet); // 중복은 제거 되어있음
        // List의 출력
        System.out.println(strList);

        // List의 element들을 전부 Set에 대입 : 세트명.addAll(리스트명)
        strSet.addAll(strList);
        System.out.println(strSet);     // 그러면 중복이 제거됨.
        // 향상된 for문으론 출력이 가능.
        for (String elem : strSet) {
            System.out.println(elem + " 언어 ");
        }
        // 일반 for문으로는 불가능 -> index가 없음.
//        for (int i = 0; i < strList.size(); i++) {
//            System.out.println(strSet.get);
//        }
        // 어쨋든 중복 제거를 strSet에서 했기때문에 중복제거 버전을 다시 List로 옮길수 있음.
        List<String> modifiedlist = new ArrayList<>();
        modifiedlist.addAll(strSet);
        System.out.println(modifiedlist);
        Collections.sort(modifiedlist);
        System.out.println(modifiedlist);

    }
}
