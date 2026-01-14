package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class ProductMap1 {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Gson GsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Map<String,String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYEY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");

        System.out.println("productMap1 = " + productMap1);

        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = GsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);
        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 넣는것도.
            Map으로 생성은 entry를 Json 형태로 바꾸는것도 가능하다는 것을 알수잇음.
            그리고 JsonObject 객체도 바꿀수있음

            그러면 반대로 json -> Map / Java Object 로 바꾸는것도 가능

            근데 String data인 json을 ""포함해서 생성하는게 너무 귀찮기때문에
            user1과 productMap1을 json으로 바꾼 데이터를 바꿔보는걸로 함.

            jsonData2를 user2 객체로 변경, String -> User 으로 바뀜.
            jsonProduct2를 productMap2로 바꾸겠음.
         */

        Map<String,String> productMap2 = gson.fromJson(jsonProduct1, Map.class);
        System.out.println(productMap2);

        // 그러면 JsonData1 / 2를 userMap1으로 바꿀수 있음.
        // field : fieldValue 롤 일대일 매칭이 되기 때문.
        /*
            하지만 jsonProduct1 / 2 는 java Object로 못 바꿈 -> 클래스가 아직 정의되지 않았기 때문

            그럼 jsonData1을 Map 자료형의 userMap1으로 변경하시오.
            그리고 콘솔에 출력하시오.
         */

        Map<String, Objects> userMap1 = gson.fromJson(jsonProduct1, Map.class);
        System.out.println(userMap1);

    }
}
