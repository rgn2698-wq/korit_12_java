package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Book {
    private long bookId;
    private String title;
    private String author;
    private List<String> categories;
}


public class JSON3Test {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        /// 객체 생성
        // 카테고리 List 생성
        List<String> categories1 = new ArrayList<>();
        categories1.add("프로그래밍");
        categories1.add("컴퓨터공학");
        // 생성자 생성 1
        Book book1 = new Book(101L,"자바 마스터", "안선생", categories1);
        // Json 변환
        String json = gsonBuilder.toJson(book1);
        System.out.println(json);
        System.out.println();   // 줄 바꿈
        // Json -> Map 변환
        Map map = gsonBuilder.fromJson(json,Map.class);
        // title 값 뽑아내기
        System.out.println("도서 제목 : " + map.get("title"));
        System.out.println();   // 줄바꿈
        // List 생성 및 데이터 추가
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        // 카테고리 List 생성 2
        List<String> categories2 = new ArrayList<>();
        categories2.add("데이터분석");
        // 생성자 생성 2
        Book book2 = new Book(102L, "파이썬 입문", "김철수", categories2);
        bookList.add(book2);
        // 변환및 출력
        String json2 = gsonBuilder.toJson(bookList);
        System.out.println(json2);
    }
}
