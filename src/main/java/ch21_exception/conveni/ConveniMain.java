package ch21_exception.conveni;

import ch21_exception.signup.InvalidIdException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConveniMain {
    public static void order(int stock) throws InvalidOrderQuantityException {
        if (stock < 1 || stock > 50) throw new InvalidOrderQuantityException("주문 수량 오류 : 1 ~ 50 까지 입력할수 있습니다.");
        System.out.println(stock + "개를 주문했습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("수량을 입력 하세요 >>> ");
            int stk = sc.nextInt();
            order(stk);
        } catch (InvalidOrderQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력할수 있습니다.");
        } catch (Exception e) {
            System.out.println("알수없는 오류가 발생했습니다.");
        } finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}
