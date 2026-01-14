package ch19_collections.testitem;

import java.util.*;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문",2);
        boolean endOfProgram = false;
        String bookTitle = "";
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2.재고 수정\n3. 재고 목록\n4.종료");
            System.out.println("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    // 기존에 있는 책인지 확인
                    if (!bookInventory.containsKey(bookTitle)) {    // 만약 true라면 이미 있는 책
                        System.out.println("이미 등록 된 도서입니다.");
                    } else {    // 일치하는 책이 없을때 실행하는 조건문
                        System.out.print("재고 수량을 입력하세요. >>> ");
                        int stock = scanner.nextInt();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + "도서가 " + stock + "권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("수량을 변경할 도서명을 입력하세요. >>> ");
                    bookTitle = scanner.nextLine();
                    if (!bookInventory.containsKey(bookTitle)) {
                        // 기존 guide 풀이 방법
//                        System.out.print("\n새로운 재고 수량을 입력하세요 >>> ");
//                        int stock = scanner.nextInt();
//                        scanner.nextLine();
//                        bookInventory.replace(bookTitle, stock);
//                        System.out.println(bookTitle + " 문서가 " + stock + "권으로 변경 되었습니다.");
                        // 그냥 추가분을 입력하면 기존 것에서 더하는 로직.
                        System.out.print("재고 변경문을 입력하세요>>>");
                        int temp = scanner.nextInt();
                        int stock = bookInventory.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 문서가 " + stock + "권으로 변경 되었습니다.");
                        bookInventory.put(bookTitle,stock);
                        // 이상의 코드에서 추가 수정 사항: 책이 팔리면 -1로 입력해야함.
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3:
                    Set<String> bookTitleSet = bookInventory.keySet();  // 책 제목들만 모아서 Set으로 만듦
                    List<String> bookTitles = new ArrayList<>();    // Set
                    bookTitleSet.addAll(bookTitleSet);
                    for (String book : bookTitles) {
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;      // case의 break; 는 switch 문만 빠져나오고 while문은 빠져나오지 못하기때문에
                                // 63,64번이 모두 있어야함.
                default:
                    System.out.println("잘못 된 메뉴 선택입니다.");
            }
            /*
                2번 메뉴를 재고 입고로 변경하고 3번 메뉴를 재고 출고로 변경하여
                입고 선택시 입고량을 입력 받아서 기존 재고에 +시키고
                출고 선택시 출고 량을 입력 받아서 기존 재고에서 - 합니다.
                하지만 출료량이 기존 재고문 보다 초과일 경우 재고가 충분하지 않습니다. 라는
                출력문을 안내하고 다시 메뉴 선택으로 돌아갈수 있도록 수정하시오.
                BookMap3 만들어서 전체 작성.
             */
        }
    }
}
