package ch10_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        // 객체 생성
        Bank bank1 = new Bank(123456, "홍길동", 100000, 1234);

        Bank bank2 = new Bank(987654, "심사임당", 500000, 9999);

        // 초기상태 출력
        bank1.showAccountInfo();
        bank2.showAccountInfo();

        // 입금 50000
        bank1.deposit(50000, 1234);

        // 출금 200000 (실패 시나리오)
        bank1.withdraw(200000, 1234);

        // 출금 100000 (성공)
        bank1.withdraw(100000, 1234);

        // 출금 100000
        bank2.withdraw(100000, 9999);

        // 입금 200000
        bank2.deposit(200000, 9999);

        // 4. 최종 계좌 정보 출력
        System.out.println("최종 계좌 정보");
        bank1.showAccountInfo();
        bank2.showAccountInfo();
    }


    }

