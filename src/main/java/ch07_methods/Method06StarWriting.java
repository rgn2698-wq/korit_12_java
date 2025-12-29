package ch07_methods;

import java.util.Scanner;

public class Method06StarWriting {
    //call4() 유형으로 작성할 에정 -> 몇 줄 짜리 별 찍을건지
    // 어떤 유형의 별찍기를 할건지 main에서 받을 예정이기 때문에.
    // method의 정의 영역
    public static String getStar(int row, int option) {
        String result = "";
        //
        if (option < 1 || option > 4) {
            result = "불가능한 메뉴 선택입니다. 1 - 4의 정수만 입력해주세요.";
        }else {

        if(option == 1) {

            for ( int i = 0 ; i < row + 1 ; i++ ) {

                for( int j = 0; j < i ; j++) {
                    result = "*";
                }
            }
                result += "\n";
        } else if (option == 2) {
            for ( int i = 0 ; i < row ; i++) {
                //공백
                    for ( int j =0 ; j < row - (i + 1) ; j++ ) {
                        result = "빨원";
                    }
            }
        } else if (option == 3 ) {
            // 개행
            for ( int i = 0 ; i < row ; i++ ) {
                // 별
                for ( int j = row ; j > i ; j-- ) {
                    result+="😊";
                }
                result+="\n";

            }
        } else {        // else if (option == 4) 라고 쓸 필요x
            // 개행을 책임지는 바깥쪽 for문
            for ( int i = 0 ; i < row ; i++) {
                //공백을 책임지는 안족 1번 for문
                for ( int j = 0 ; j < i + 1 ; j++ ) {
                    result += " ";
                }
                //별을 책임지는 안쪽 2번 for문
                for ( int k = row ; k > i ; k-- ) {
                    result += "하트";
                }
            }

        }
        return result;
    }
        return result;
    }

    // method의 호출 영역
    public static void main(String[] args) {
        //사용할 객채 생성
        Scanner scanner = new Scanner(System.in);
        //사용할 변수 선언
        int rowOfStars = 0; //몇 줄짜리 만들건지
        int choice = 0;     // 증가하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 지료형이라서 이런식으로 선언 및 초기화

        System.out.println("몇 줄 짜리 별을 생성 하시겠습니까? >>>");
        rowOfStars = scanner.nextInt();


        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 왼쪽으로 치우진 감소하는 별");
        System.out.println("3. 오른쪽으로 치우진 증가하는 별");
        System.out.println("4. 오른쪽으로 치우진 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까? >>>");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        /*

            1.getStar()라고 하는 '정적 메서드'가 있다는 점
            2.getstar() 메서드는 매개변수가 있고, return 타입이 있는 call4() 유형 이라는 점.
                - ()대해 변수명이 들어가있다는 점에서,
                - int
                -
                -
         */
        //메서드 호출

        System.out.println(starResult);
}
    }
