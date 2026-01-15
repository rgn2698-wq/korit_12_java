package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(22, 153, 633, 3463, 3473, 1, 2356, 35, 523);
        scores.stream()                             // 1. StreamAPI 사용
                .filter(s -> s >= 60)        // 2. 60 점 미만은 뺌
                .map(s -> s + 5)             // 3. 남아있는거에 5씩 더함
                .sorted()                           // 4. 오른차순으로 정렬
                .forEach(System.out::println);      // 5. 결과값 출력
    }
}
