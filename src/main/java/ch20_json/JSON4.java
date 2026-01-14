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
class Book2 {
        private long bookId;
        private String title;
        private String author;
        private List<String> categories;
}


public class JSON4 {
    public static void main(String[] args) {
        Gson gson =  new GsonBuilder().setPrettyPrinting().create();
        List<String> categories = new ArrayList<>();
        categories.add("프로그래밍");
        categories.add("컴퓨터공학");
        Book book0 = new Book(101L,"자바 마스터", "안선생",categories);
        Book book1 = new Book(101L,"자바 마스터", "안선생",List.of("프로그래밍,컴퓨터공학"));

        String jsonData1 = gson.toJson(book1);
        System.out.println(jsonData1);

        Map<String,Object> bookMap1 = gson.fromJson(jsonData1,Map.class);
        System.out.println("도서 제목 : " + bookMap1.get("title"));

        // List -> json 배열 변환
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(new Book(102L, "파이썬 입문","김철수",List.of("데이터분석")));

        String booksString = gson.toJson(books);
        System.out.println(booksString);
    }
}
