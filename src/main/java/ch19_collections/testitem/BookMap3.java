package ch19_collections.testitem;

import java.util.*;


public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> bookChest = new HashMap<>();
        while (true) {
            System.out.println("=== 📚 도서 재고 관리 시스템 Ver.3 ===");
            System.out.println("1. 도서 등록 (신규)\n2. 재고 입고 (+)\n3. 재고 출고 (-)\n4. 전체 재고 목록\n5. 종료");
            System.out.print("메뉴를 선택하세요 >>>");
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == 1) { // 1. 신규 등록
                System.out.print("신규 등록할 도서명을 입력하세요 >>> ");
                String title = scanner.nextLine();
                if (bookChest.containsKey(title)) {
                    System.out.println(">>> 이미 등록된 도서입니다. '2. 재고 입고'를 이용하세요.");
                } else {
                    System.out.print("초기 재고 수량을 입력하세요 >>> ");
                    int cnt = scanner.nextInt();
                    if (cnt < 0) {
                        System.out.println(">>> [경고] 재고는 0개 이상이어야 합니다.");
                    } else {
                        bookChest.put(title, cnt);
                        System.out.println("✅ [" + title + "] 신규 등록 완료 했습니다.");
                    }
                }
            } else if (select == 2) { // 2. 입고 (+)
                System.out.print("입고할 도서명을 입력하세요 >>> ");
                String title = scanner.nextLine();
                if (!bookChest.containsKey(title)) {
                    System.out.println(">>> [오류] 미등록 도서입니다. 먼저 등록해주세요.");
                } else {
                    System.out.print("입고할 수량을 입력하세요 >>> ");
                    int inStock = scanner.nextInt();
                    if (inStock < 0) {
                        System.out.println(">>> [경고] 0보다 큰 수를 입력하세요.");
                    } else {
                        bookChest.put(title, bookChest.get(title) + inStock); // 기존 + 입고
                        System.out.println("📦 입고 완료! 현재 재고: " + bookChest.get(title) + "권");
                    }
                }
            } else if (select == 3) { // 3. 출고 (-)
                System.out.print("출고할 도서명을 입력하세요 >>> ");
                String title = scanner.nextLine();
                if (!bookChest.containsKey(title)) {
                    System.out.println(">>> [오류] 미등록 도서입니다.");
                } else {
                    System.out.print("출고할 수량을 입력하세요 >>> ");
                    int outStock = scanner.nextInt();

                    if (outStock < 0) {
                        System.out.println(">>> [경고] 0보다 큰 수를 입력하세요.");
                    } else {
                        int currentStock = bookChest.get(title);
                        if (outStock > currentStock) {
                            System.out.println("[재고 부족] 현재 재고가 " + currentStock + "권 뿐입니다!");
                        } else {
                            bookChest.put(title, currentStock - outStock); // 기존 - 출고
                            System.out.println("출고 완료! 남은 재고: " + bookChest.get(title) + "권");
                        }
                    }
                }
            } else if (select == 4) { // 4. 목록
                System.out.println("--- 현재 재고 목록 ---");
                if (bookChest.isEmpty()) {
                    System.out.println("등록된 도서가 없습니다.");
                } else {
                    List<String> sortedKeys = new ArrayList<>(bookChest.keySet());
                    Collections.sort(sortedKeys);
                    for (String key : sortedKeys) {
                        System.out.println("도서명 : " + key + " , 재고 수량 : " + bookChest.get(key) + "권");
                    }
                }
            } else if (select == 5) { // 5. 종료
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
        scanner.close();
    }
}