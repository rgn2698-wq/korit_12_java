package ch11_arrays;

import ch07_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력
    엄밀히 말하면 저희는 배열을 출력한게 아니라 배열 내부의 element들을 출력
    해봤습니다. System.out.println(arr01); 과 같은 출력문을 작성했을때,
    주소값이 튀어나온다는 사실을 확인할수있었습니다.

    근데 element의 값을 조정하거나, 더하거나 등의 추가적인 가공을 하기위해서
    for문을 사용해왔는데, 굳이 변형이 없고 배열 자체에 값이 들어갔는지만
    확인하고 싶은데 매번 main에다가 반복문을 작성을 하든지,
    아니면 method를 정의해서 매번 호출해야하는지는 좀 의문이 듭니다.

    Arrays 클래스를 사용하고, '정적' 메서드인 .toString(배열명)을 사용하면
    배열 전체를 출력할수있습니다.

    이상에서 중요한점은
    클래스명.메서드명() 이라는 점입니다.
    scanner.nextLine();의 경우에는 객체명.메서드명()이였는데 차이가 있습니다.
    그리고 toString() 이라는 메서드도 곧 사용하게 됩니다.

    이상에서 확인해야할 부분은 동일한 method 명이라고 하더라도
    어떤 클래스에 종속되어있는가에 따라 다른 결과값을 지닐수 있다는 점입니다.
 */
public class Array10PrintArray {
    public static void main(String[] args) {
        // 동일한 메서드 명이지만 클래스에 따라 서로 다른 로직일수 있다는 예시
//        Random random = new Random();   // 랜덤 클래스의 객체 생성
//        Scanner scanner = new Scanner(System.in);   //스캐너 클래스의 객체 생성
//        int num1 = random.nextInt();
//        System.out.println("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num1);
//        System.out.println(num2);
        // 이상의 경우에서 random.nextInt();는 int 범위 내에서 임의의 정수를
        // 생성하는 메서드이고, scanner.nextInt();는 int 값을 콘솔에서 입력하는
        // 메서드라는 점을 알 수 있습니다. 즉, 같은 method명이면서도
        // 어떤 클래스의 객체에서 호출하느냐에 따라서 결과값이 다르네요
//        Random sc = new Random();
//        int num3 = sc.nextInt();

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // 배열 전체 출력 예시
        System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.asList(numbers).toString());
        // chaining method로 toString()이 있음을 확인.
        Method01.call1();   // 그래서 객체명.메서드명(); 할때와는 알리 이때는
        //메서드 정의할때 무언가 하나 더 쓰고 메서드를 정의했었습니다. (추후 수업 예정)

        // 그래서 굳이 제가 random / scanner로 예시를 보여드렸습니다.
        // 개발자들 끼리 어떤 약속한 메서드명도 일부 존재한다는것을 의미합니다.

        // #1 Arrays.toString(배열명); : 배열의 출력
        // #2 Arrays.sort(배열명); : 배열의 정렬 오름차순
        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};
        System.out.println("정렬 전 배열 : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 후 배열 : " + Arrays.toString(nums));
        /*
            sort()fmf ctrl + 클릭 해보니까 return 타입이 void입니다.
            즉 여기서 알수있는 점은 nums 원본 배열을 통째로 바꿧다는 점입니다.
         */
//        System.out.println(Arrays.toString(Arrays.sort(nums)));
        // 이상의 코드는 그래서 오류가 납니다. 먼저 바꿀건지 먼저 출력할건지 모르죠.
        // Arrays.sort(nums);의 결과값이 void이기때문에 return이 없는데
        // Arrays.toString(); 에는 배열을 넣어야만 하기 때문에 오류가 발생합니다.

        // 그리고 얘는 method overloading의 예시라고 할수 있곘네요.
        // 매개변수가 두개로 늘어났으니까요
        Arrays.sort(nums, Comparator.reverseOrder()); // 현재 오류가 발생함 int[]
        // nums를 Integer[]로 바꾸니까 오류가 사라졌습니다.

        System.out.println("내림 차순 정렬 후 배열: " + Arrays.toString(nums));
        /*
            이상의 경우에서 sort() 메서드에 오름차순 에서는 argument가 하나있는데,
            내림 차순 할때는 보니까 두개입니다.
            이상의 과정이 overloading이 이루어졌다는 점을 파악할수있으면 현재 수준으로는
            만족스럽습니다.

            그리고 두번째 argument로 Comparator.reverseOrder()가 사용 되었는데
            메서드의 결과값이 sort()의 두번째 argument로 사용되었다는 점에서
            함수형 프로그래밍의 일종이라고 볼 수 있겠습니다.
            근데 기본 자료형(primitive types)인 int[] 배열을 사용할수 없어서
            Integer[]배열을 사용했다는 점도 특이 사항중 하나인데,
            현재 수준으로는
            char -> String처럼 int -> Integer라고 생각해두시면 됩니다.
         */

    }
}
