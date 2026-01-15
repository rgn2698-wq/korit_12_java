package ch21_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    예외 클래스는 별개로 정의했지만 메서드를 호출했을때
    예외를 처리 해야하기 때문에 특정 예외를 참조 한다는 것을
    명시 해야 함.
 */
public class AgeMain {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age > 0 || age < 200) {
            // 원래는 내부에 하나하나 쓰고 그 다음에 else를 쓰든 아니면 추가 if문을 작성함.
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요 >>> ");
//        int age = sc.nextInt();
        /*
            이전에는 이상의 코드에 바로 scanner를 집어넣었지만
            생각해보면 여기부분에 음수 혹은 200 로그정수 그리고 실수를 입력할수
            있음. 예외가 발생할수있는 부분의 코드라인은 트라이 캐치로 작성.
         */
        try {
            int age = sc.nextInt();
            checkAge(age);  // 예외를 던질 가능성이 있는 메서드를 호출
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

