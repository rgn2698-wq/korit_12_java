package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열내의 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨 -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 잡아넣는 것부터 시작하겠습니다.

    lottoNumber에 1 ~ 45까지의 숫자 중 5새를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게 끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.
 */
public class Array15Lotto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumber = new int[6];

        for (int i = 0 ; i < 6 ; i++) {
            for ( int j = 0 ; j < lottoNumber.length; j++) {
                lottoNumber[j] = random.nextInt(45) + 1;
            }
            System.out.println((i + 1) + "차 :" + Arrays.toString(lottoNumber));
        }
        // 그럼 현재 이상의 코드에서 경험한 점은 lottoNumber라는 배열을 선언했을때,
        // 그 배열에 반복문을 통해서 계속 element를 덮어쓰는 방식으로 작성을 했다는 점입니다.
        // 그 결과 반복문 외부에서 sout을 했을때 가장 최근게임의 결과값이 나오는 점이라고 할수 있습니다.


    }
}
