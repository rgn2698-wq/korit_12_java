package ch11_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        // 1부터 100까지의 숫자를 2차 배열에 순서대로 값을 넣으시오.
        // 즉, nums[0][0] = 1, nums[1][0] = 6, nums[1][1] = 7, ...

        // 값을 입력하고 나면
        // 향상된 for문을 통해서
        // 2차 배열 내부로 들어가고, Arrays.toString()으로 1부터 100까지를
        // 콘솔에 출력하시오.

        // 1 2 3 4 5
        // 6 7 8 9 10
        // ... 100
        // 으로 출력할 수 있게 출력문을 하나 더 작성하겠습니다.
        // 이건 일반 for문 중심으로 쓸께요 연습해야해서.

        // 값 대입 관련
//        for ( int i = 0 ; i < nums.length; i++) {
//            for ( int j = 0 ; j < nums[i].length; j++) {
//                nums[i][j] = (5*i) + j + 1;
//            }
//        }

        int n = 1;
        for ( int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums[i].length ; j++) {
                nums[i][j] = n++;
            }
        }
        System.out.println(n);          // 최종값은 101이 됩니다.

        for ( int[] number : nums ) {
            System.out.println(Arrays.toString(number));
        }

        for ( int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums[i].length ; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // 그렇다면 다차원 배열을 출력하는 방식은 무엇인가
        // Arrays.deepToString(다차원배열명);
        System.out.println(Arrays.deepToString(nums));
    }
}
