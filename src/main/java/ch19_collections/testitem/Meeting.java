package ch19_collections.testitem;

import java.util.*;

/*
    모임 참석자 명단 관리 프로그램 작성
    지시 사항
    1. Set을 사용해서 참석자 명단(String)을 저장. (중복 이름 안받기 위해)
    2. 사용자로부터 참석자 이름을 계속해서 입력 받을 예정
    3. 입력 받은 이름을 Set에 추가.
    4. 종료 라고 입력하면 더 이상 이름을 입력받지 않음.
    5. 최종 모임 참석자 명단을 콘솔에 출력
    실행 예
    --- 모임 참석자 명단 관리 ---
    [ 종료 ] 라고 입력하면 프로그램을 종료합니다.
    참석자 이름을 입력하세요 >>> 김일
    참석자 이름을 입력하세요 >>> 김이
    참석자 이름을 입력하세요 >>> 김삼
    참석자 이름을 입력하세요 >>> 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    김일, 김이, 김삼
 */
public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> personName = new HashSet<>();

        System.out.println("--- 모임 명단 관리 ---");
        System.out.println("[ 종료 ] 입력 시 마칩니다.");

        while (true) {
            System.out.print("이름 입력 >>> ");
            String name = scanner.nextLine();

            if (name.equals("종료")) break;

            if (!personName.add(name)) {
                System.out.println(">>> [중복] 이미 명단에 있습니다! (" + name + ")");
            }
        }

        List<String> finalPerson = new ArrayList<>(personName);

        Collections.sort(finalPerson);

        System.out.println("\n--- 최종 명단 ---");

        if (finalPerson.isEmpty()) {
            System.out.println("참석자가 없습니다.");
        } else {
            for (String person : finalPerson) {
                System.out.println("- " + person);
            }
        }

        scanner.close();
    }
}

