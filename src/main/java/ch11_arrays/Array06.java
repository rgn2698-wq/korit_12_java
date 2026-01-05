package ch11_arrays;

import java.util.Arrays;

/*
    int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    총합과 평균을 계산해서 다음과 같이 출력하시오.
    총점 : 뭐 몇점
    평균 : 뭐 몇점 (주의사항: double 형변환을 적용하셔야 합니다.

    //총합을 내는 메서드 - calcSum()
    //평균을 내는 메서드 - calcAvg()
    // 총합과 평균을 출력하는 곳에서 두 개의 메서드를 호출하는 방식으로도 작성가능
    // printSumAndAvg()
 */
public class Array06 {
    public static void main(String[] args) {
    /*
        int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int sum = 0;
        double avg = 0;
        for (int i = 0 ; i < scores.length ; i++ ) {
            sum+= scores[i];
        }
        avg = ((double)sum / scores.length);
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

        }
     */

        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = ((double) sum / scores.length);    // sum이 int인 상황에서는 소수점이 나오지 않을 것 같습니다
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

        Array06 array06 = new Array06();
        array06.printSumAndAvg(scores);

        double[] scores2 = {4.5, 4.4};
        array06.printSumAndAvg(scores2);

    }

    private double calcSum(int[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();      // 당연히 원리 아니까 반복문으로 쓰셔도 무방한데 너무 반복해서 그냥 이거 썼습니다.
        return sum;
    }

    private double calcAvg(int[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();        // 마찬가지
        return avg;
    }

    public void printSumAndAvg(int[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + (int) sum + "점\n평균 : " + avg + "점");
    }

    // method overloading을 통해서 int[] 배열만 받는게 아니라 double[]배열을 받더라도 연산을 할 수 있도록 준비

    public void printSumAndAvg(double[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + (int) sum + "점\n평균 : " + avg + "점");
    }

    private double calcSum(double[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();      // 당연히 원리 아니까 반복문으로 쓰셔도 무방한데 너무 반복해서 그냥 이거 썼습니다.
        return sum;
    }

    private double calcAvg(double[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();        // 마찬가지
        return avg;
    }
}
