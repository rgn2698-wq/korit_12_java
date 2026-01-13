package ch19_collections.testitem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Meeting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                Set<String> attendees = new HashSet<>();

                System.out.println("--- 모임 참석자 명단 관리 ---");
                System.out.println("[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");


                while (true) {
                    System.out.print("참석자 이름을 입력하세요 >>> ");
                    String name = scanner.nextLine();


                    if (name.equals("종료")) {
                        System.out.println("프로그램이 종료되었습니다.");
                        break;
                    }
                attendees.add(name);
                }
                System.out.println("\n--- 최종 참석자 명단 ---");

                String result = String.join(", ", attendees);
                System.out.println(result);

                scanner.close();
    }
}

