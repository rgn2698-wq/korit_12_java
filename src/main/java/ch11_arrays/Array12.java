package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Random random = new Random();
        // 사용할 변수 선언
        Integer[] numbers = new Integer[10];
        // 배열 내에 값 대입 -> 반복문 // 값을 입력하는 것이기 때문에
        // 일반 for문이 더 낫겠네요.
        for ( int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }
        // 출력
        System.out.println(Arrays.toString(numbers));
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
        /*
            random.nextInt();
            argument가 없을 떄는 가장 작은 정수부터 가장 큰 점수(int 범위 내)
            중 하나를 임의 생성함.
            random.nextInt(한계값);
            argument가 하나 있을 때는 한계값을 설정합니다. 근데 0을 포함하기 때문에
            random.nextInt(10); 이라면 0~9까지의 범위에서 생성합니다.
            생각 해볼 점:
            1부터 10까지의 범위를 만들고 싶다면?
         */
        // 오름차순 배열
        Arrays.sort(numbers);   // 원본 배열을 바꾸기 때문에 주의할 것 - void
        System.out.println(Arrays.toString(numbers));
        // 내림 차순 배열
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        // 값을 꺼내서 10씩 곱해야 합니다.

        /*
            그럼 전반적으로 수정하겠습니다.
            1부터 100까지의 값을 다시 입력하겠습니다.
            그리고 10씩 곱하고
            향상된 for문을 통해서 10 / 120 / 79 / ... / 로 출력될수있도록
            이하의 코드를 작성하시오.
         */


        for (Integer num : numbers) {
            num *= 10;
            System.out.print(num + " / ");
        }
    }
}
