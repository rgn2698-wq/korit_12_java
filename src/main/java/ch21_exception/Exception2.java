package ch21_exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);     // 이건 그냥 message를 argument로 한 LoginFailedException의 슈퍼 클래스 생성자를 호출한것.
        System.out.println("로그인 시 예외가 발생했습니다.");
    }
}

/*
    Exception(String message) {
        this.message = message;
    }
    인 상태. 그걸 42번 라인에서 getter(getMessage())를 불러서 출력했기때문에 콘솔창의 순서가 다르게 보임.
 */

public class Exception2 {
    public static void login(String id , String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";
        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throws 명령어를 입력해야 함
        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 Password가 틀렸습니다");
            // throw(s없음) : 동사 원형으로 시작했으니 명령문
            // LoginFailedException() 생성자에 String argument 널어서 객체를 생성했는데
            // 그 객체를 던지라는 의미로 해석할수 있음

        }
    }


    public static void main(String[] args) {
        String inputId = "admin";
        String inputpassword = "1q2w3e4r!!";

//        login(inputId, inputpassword);
        // throws를 달고 나니까 오류발생 -> try / catch / finally를 쓰라는 뜻
        // 혹은 main도 method에 해당하니 main 메서드에 throws를 입력
        try {
            login(inputId, inputpassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}

