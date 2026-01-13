package ch19_collections.testitem;

import java.awt.*;
import java.util.*;
import java.util.List;

/*
    서점에서 판매하는 책 재고를 관리하는 프로그램
    지시 사항
    1. Map을 사용하여 도서명(String)을 key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가.
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성.

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>> 10
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 2
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9 권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    --- 현재 재고 목록 ---
    도서명 : 자바의 정석, 재고 수량 : 9 권
    도서명 : python의 정석, 재고 수량 : 1 권

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램을 종료합니다.
 */
public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 책 저장소 생성
        Map<String, Integer> book = new HashMap<>();

        while (true) {
            System.out.println("\n--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");

            int select = scanner.nextInt();
            scanner.nextLine();

            // 도서추가 칸
            if (select == 1) {
                System.out.print("새 도서명을 입력하세요 >>> ");
                String title = scanner.nextLine();

                if (book.containsKey(title)) {
                    System.out.println("이미 등록되어있는 도서입니다.");
                } else {
                    System.out.print("수량을 입력하세요 >>> ");
                    int cnt = scanner.nextInt();
                    if (cnt < 0) {
                        System.out.println(">>> [경고] 재고는 0개 이상이어야 합니다!");
                    } else {
                        book.put(title, cnt);
                        System.out.println(title + " 도서가 " + cnt + "권 추가 되었습니다.");
                    }
                }

                // 2. 재고 수정 칸
            } else if (select == 2) {
                System.out.print("수량 변경 할 도서 명을 입력해주세요. >>> ");
                String title = scanner.nextLine();

                if (book.containsKey(title)) {
                    System.out.print("새로운 재고 수량을 입력하세요. >>> ");
                    int newCnt = scanner.nextInt();
                    if (newCnt < 0) {
                        System.out.println(">>> [경고] 재고는 음수가 될 수 없습니다");
                    } else {
                        book.put(title, newCnt);
                        System.out.println(title + " 도서가 " + newCnt + "권으로 수정되었습니다.");
                    }
                } else {
                    System.out.println("해당 도서는 재고에 없습니다.");
                }

                // 3. 재고 확인
            } else if (select == 3) {
                System.out.println("ㅡㅡㅡ 현재 재고 목록 ㅡㅡㅡ");

                if (book.isEmpty()) {
                    System.out.println("재고가 없습니다.");
                } else {
                    Set<String> keySet = book.keySet();

                    List<String> keyList = new ArrayList<>(keySet);

                    Collections.sort(keyList);

                    for (String key : keyList) {
                        int value = book.get(key);
                        System.out.println("도서명 : " + key + ", 재고 수량 : " + value + "권");
                    }
                }

                // 4. 종료
            } else if (select == 4) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }
}
