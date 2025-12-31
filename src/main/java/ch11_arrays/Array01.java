package ch11_arrays;

import ch10_access_modifier.bank.Bank2;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr01 = {1,2,3,4,5};


        // 이상의 코드를 실행해봤을때, 배열내부의 값을 확인할 수 없습니다.
        // @를 고려했을때 주소재만 출력됩니다.
        /*
            현재 배열 내부에 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이
            불가능합니다.
            즉 element를 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요합니다.
            이때 필요한 개념이 index(주소지라고도 할겁니다) 입니다.
         */
        System.out.println(arr01);      // 주소값만 출력됨.
        System.out.println(arr01[0]);      // 주소값만 출력됨.
        System.out.println(arr01[1]);      // 배열명[index]의 형태로 내부 element 확인가능
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);      // 그럼 중요한게 뭐냐면 index는 0부터 시작한다는 점.


        // for문을 통해서 arr01에 있는 내부요소를 콘솔에 출력하시오.
        // 그런데 실행 예
        // 1 2 3 4 5
        // 로 출력하시오.

        for (int i = 0; i < 5 ; i++) {
            System.out.println(arr01[i] + " ");
        }
        // 이상의 코드에서 한계값 부분에 주목해서 본다면, 유리가 배열의 element 개수를
        // 알고있을 때만 작성이 가능하다는 점을 알 수 있습니다.



        // 근데 이상과 같이 제가 element의 개수를 마음대로, 그리고 가독성 없게 작성했다고 치면
        // 직접 한계값을 하드코딩해서 집어넣기가 번거로워집니다.

        // 우리는 컴퓨터 한테 직접 한계값을 구해서 알아서 출력하도록 명령을 내릴 필요가
        // 있을 것 같습니다.

        // 배열명.length; 근데 우리는 비슷한걸 봤습니다. 문자열데이터.length();
        for( int i = 0 ; i < arr01.length ; i++) {
            System.out.print( arr01[i] + " / ");
        }

        /*
            빈 배열 생성
            자료형1[] 배열명 = new 자료형1[개수]
            얘가 다른 안어에 비해서 골치 아픈게, 미리 방의 개수를 지정을 해줘야합니다.

            이상의 사항을 종합했을때
            배열 내부의 방의 개수 / 주소지의 한계값 - 1을 우리가 항상 알고있는 것은 아니기 때문에
            element 값을 출력하기 위한 한계값을 결설정할때
            배열명.length를 생활화 하는것이 좋습니다.
         */
        System.out.println();
        int[] arr03 = new int[10];  // 10개짜리 방을 가진 비어있는 배열을 생성합니다.
        System.out.println(arr03[0]);   // int로 선언했기 때문에 초기화를 하지않았다면 -

        // 배열의 특정 index에 값을 대입하는 방법
        arr03[0] = 10;                  // 그러면 이 친구는 초기화라고 볼까요 재대입이라고 볼까요
        arr03[1] = 20;                  // 그러면 이 친구는 초기화라고 볼까요 재대입이라고 볼까요
        arr03[2] = 30;                  // 그러면 이 친구는 초기화라고 볼까요 재대입이라고 볼까요
        // 정답: 의미없음 / 다만 중요한 것은 처음 값을 대입하는데도 int arr03[0] = 10;이
        // 아니라는 점입니다.
        // 즉 배열을 선언한다는 것은 내부의 index 넘버를 포함하여 컴퓨터가 알아서 선언 작업을
        // 마친다는 것입니다.

        // 그렇다면 arr03[0]과 같은 부분은 그냥 int 변수를 선언하고 거기에 값을 대입한거라고
        // 생각할 수 있겠네요.
        System.out.println(arr03[0]);

        int[] arr04  = new int[40];
        // 이상의 빈 배열에 41부터 80까지의 값을 순서대로 대입하고.
        // 41 / 42 / 43 / ... / 79 / 80 으로 출력 될수 있도록 코드를 작성하시오

        // 비어있는 String 배열을 선언하고 내부 element로 "안" "녕" "하" "세" "요" 로
        // 초기화한 후 안녕하세요로 콘솔에 출력할수 있도록 하시오

        for (int i = 0 ; i < arr04.length; i++) {
            arr04[i] = i + 41;
            System.out.print(arr04[i] + " / ");
        }


        System.out.println();


        String[] arr05 = {"안","녕","하","세","요"};
        for (int i = 0; i < arr05.length; i++) {
            System.out.print(arr05[i]);
        }
    }
}
