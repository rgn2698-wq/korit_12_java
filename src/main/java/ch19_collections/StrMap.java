package ch19_collections;

import java.util.*;

/*
    Map은 key-value pair / 쌍 / entry
 */
public class StrMap {
    public static void main(String[] args) {
        // Map의 선언 및 초기화
        Map<String,String> strMap1 = new HashMap<>();

        // Key - value 삽입 메서드 -> .put(키, 값);
        strMap1.put("kor2026001","김일");
        strMap1.put("kor2026002","김이");
        strMap1.put("kor2026003","김삼");
        strMap1.put("kor2026004","김사");
        strMap1.put("kor2026005","김오");
        System.out.println(strMap1);
        // 같은 Key에 value를 입력하게 될 경우
        strMap1.put("kor2026005","KimFive");
        System.out.println(strMap1);
        // key 하나당 value는 하나이기 때문에 같은 key를 지정하고 value를 입력 한다면
        // 가장 최근 걸로 덮어쓰게 됨. -> 변수와 비슷함.

        Map<String, Double[]> koreanScores = new HashMap<>();
        koreanScores.put("김일", new Double[4]);

        Map<String, Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김일", 85.6);
        koreanScores2.put("김이", 100.0);
        koreanScores2.put("김삼", 95.5);
        koreanScores2.put("김사", 94.2);
        koreanScores2.put("김오", 40.4);

        // #2 .replace 사용.
        koreanScores2.replace("김오", 40.4);
        System.out.println(koreanScores2);

         /*
            두 가지 방법이 존재하는 이유는 put()의 경우에는
            기존에 key가 존재한다면 value에 재대입하게 되겠지만
            없는 key라면 아예 key를 새로 생성한다는점.

            반면에 replace()의 경우에는 존재하지 않는 ekt라면 value의 갱신이 일어나지않음
            key가 존재할 때만 value의 값이 변경됨.
         */

        // .containsKey() -> boolean    : 특정 키 존재 여부
        boolean searchKeyFlag = strMap1.containsKey("kor2026001");
        System.out.println("kor2026001 존재 여부 : " + searchKeyFlag);

        // .containsValue() -> boolean : 특정 value 존재 여부
        boolean searchValueFalg = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026001") + " 존재 여부  : " + searchValueFalg);

        // Map의 entry로 부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 set 하나 생성하는데, 내부의 key가 String, Value가 String의 Map이
        // Set의 각각의 element에 해당한다는것을 의미

        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // strMap1의 자료형은 당연히 map일텐데 .entrySet()의 호출결과가 Set<Map.Entry<String, String>>
        // 으로 자동완성 된 이유는 우리가 그렇게 선언했기 때문 -> intellij support에 해당
        // 그럼 이제 우리 수준에선 strMap1.entrySet()의 호출 결과가 일종의 형변환이 이루어진 로직이 있다.
        // 해당 자료형으로 return 해서 entrySet2라는 객체에 데이터를 담았다고 해석할수 있음.
        System.out.println(entrySet2);

        // 근데 Map을 Set으로 바꿨다면 아까 학습한 내용을 토대로 봤을때 Set -> List로 형변환할 수 있다.
//        List<Map.Entry<String, String>> entryList = strMap1.
        // 근데 위는 보니까 안됌. Map을 List로 바꾸고 싶다면 Set을 경유해야함.

        // 그리고 일단 경우해서 map->Set->List가 됐다면 list에 있는 method도 쓸수 있으니
        // /.sort() 등을 이용할 수 있음.

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // Value Set
//        Set<String> valueSet = strMap1.values();    // .values()가 있는걸 보니
        /*
            key는 당연히 중복이 안되기 때문에 Set으로 변환 하더라도 데이터의 손실이 없지만
            각 Key의 Value들은 중복 값이 있을수도 있기 때문에 그것을 Set 자료형으로 변경할 경우
            데이터 누락이 생길수 있으므로 불가능

            그리고 .value() 를 했을때 Collection이라는 자료형이
            return 된다는 것을 확인했음 그러므로
         */
        Collection<String> values = strMap1.values();
        System.out.println(values);
        // 이렇게 하면 되지않을까 라고 스스로 추측을 할수있게 됨.
        /*
            Collections는 .sort()할때 써봤지만 Collection은 처음 써봄.
            근데 return 형 본 다음에 직접 쓰면 좋음
         */
    }

}
