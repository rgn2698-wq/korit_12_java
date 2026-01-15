package ch22_lambda;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums = new ArrayList<>();
        // 짝수만 뽑아서 evenNums에 대입하고 evenNums를 출력하시오.

        for (Integer num : nums) {
            if (num % 2 == 0) evenNums.add(num);
        }
        System.out.println(evenNums);
        System.out.println("--- 람다식 적용 ---");
        nums.stream().filter(n -> n%2==0).forEach(System.out::println);

    }
}
