package ch21_exception.signup;

import java.util.Scanner;

public class SignupMain {
    public static void checkId(String Id) throws InvalidIdException {
        if (Id.length() <= 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다. ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("아이디를 입력하세요 >>> ");
            String Id = sc.nextLine().replaceAll(" ", "");
            checkId(Id);
            System.out.println("사용 가능한 ID입니다.");
        } catch (InvalidIdException e) {
            System.out.println("사용할수 없는 Id입니다. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알수없는 오류가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
