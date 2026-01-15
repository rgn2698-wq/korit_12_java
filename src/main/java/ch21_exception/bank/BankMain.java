package ch21_exception.bank;

import java.util.Scanner;

public class BankMain {
    static int balance = 10000;


    public static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance){
            int stock = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다. 부족 금액 : " + stock + "원." );
        }
        balance -= amount;
        System.out.println(amount + "원이 성공적으로 출금 되었습니다." + "남은 잔액 : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("출금할 금액을 입력하세요 >>> ");
            int amount = sc.nextInt();
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            System.out.println("프로그램을 정상종료합니다.");
        }
    }
}
