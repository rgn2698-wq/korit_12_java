package ch11_arrays;
/*
    향상된 for문(enhanced for loop)

    일반 for문 과의 차이점 :
        일반 for문의 경우 index넘버(주소지)를 명확하게 알고 있어야 하지만
        일일이 element의 숫자를 세는것이 번거롭기 때문에
        arr01.length와 같은 일종의 field 참조를 통해 int 값을 추출하여
        대입 해야만 했습니다.

        그런데 잘 생각해보면 for ( int i = 0 ; ,,,) 부분에서 int i는
        for문 내부에서만 선언되고, 내부에서만 사용이 가능합니다.

        이를 응용하여 배열내의 element에 for문 내부에서 만 사용하는 변수에
        대입하는 방식을 사용하여 index 넘버의 사용없이 적응할수있는데 for
        반복문이 있는데, 이를 향상된 for문이라고 합니다.

    제약:
        읽기만 되고, 쓰기가 안됩니다.
    형식:
    for ( 자료형 변수명 : 반복가능객체(배열)) {
            반복실행문
    }
 */
public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        // 1부터 200까지 숫자 대입하시오
        // 일단 for문으로 1 2 3 4 5 ... 200으로 출력하시오

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        // 향상된 for문으로 출력하시오
        // for (자료형 변수명 : 배열명) {반복실행문}
        for (int number : nums) {           // 자료형 변수명 이니까 선언했다고도 볼수있겠네요.
            System.out.print(number + " ");
        }
        System.out.println();
//        System.out.println(number); 오류발생
        /*
            첫 번째 반복에서 nums의 첫번째 element인 1을 number에 대입 -> 초기화
            즉 number - 1; 이 된 상황. 어디서 되었냐면 -> 37번 라인에서 적용되었습니다.
            그리고 38번 라인에서 출력시키는 명령문이 있으니까 "1 "이 출력되었습니다.
            두번째 반복으로 넘어가서 nums의 1번지에 있는 2가 number에 재대입 됩니다.
            ...
            nums의 199번지에 있는 200이 number에 재대입되고 출력됩니다.

            String 배열에 김일, 김이, 김삼, 김사, 김오 라는 element를 가지도록 초기화를 하고 (배열명 names)
            일반 for문으로 김일 / 김이 / 김삼 / 김사 / 김오 로 출력
            향상된 for문으로 김일 / 김이 / 김삼 / 김사 / 김오 로 출력
         */

        // 일반 for문
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " / ");
        }
        System.out.println();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 향상된 for문
        for (String name : names) {
            System.out.print(name + " / ");
        }


    }
}
