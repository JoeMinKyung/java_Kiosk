package com.example.level6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);
    private List<Menu> menus = new ArrayList<>(); // 여러 메뉴 카테고리 관리
    private Cart cart = new Cart(); // 장바구니 관리

    // 메뉴 카테고리 추가
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    // 프로그램 시작 메서드
    public void start() {
        while (true) {
            // 메인 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            // 숫자 입력
            String input = sc.nextLine();

            try {
                // 입력 값 숫자로 변환
                int orderNumber = Integer.parseInt(input);

                // 종료 조건
                if (orderNumber == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                // 메뉴 번호 유효성 검사
                if (orderNumber > 0 && orderNumber <= menus.size()) {
                    // 선택된 메뉴 출력
                    Menu selectedMenu = menus.get(orderNumber - 1);
                    printMenu(sc, selectedMenu);
                } else {
                    System.out.println("잘못된 입력입니다. 0부터 " + menus.size() + "까지의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 입력 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
            System.out.println();
        }
    }

    // 메뉴 출력 메서드
    private void printMenu(Scanner sc, Menu menu) {
        while (true) {
            System.out.println();
            // 서브 메뉴 출력
            System.out.printf("[ %s MENU ]%n", menu.getCategoryName());
            menu.printMenuItems();
            System.out.println("0. 뒤로가기");

            // 사용자 입력
            String input = sc.nextLine();

            try {
                // 입력 값 숫자로 변환
                int choice = Integer.parseInt(input);

                // 뒤로 가기
                if (choice == 0) {
                    break;
                }

                // 메뉴 번호 유효성 검사
                if (choice > 0 && choice <= menu.getMenuItems().size()) {
                    // 선택된 메뉴 출력
                    MenuItem selectedItem = menu.getMenuItems().get(choice - 1);
                    System.out.printf("선택한 메뉴: %s%n", selectedItem.toStringWithoutNumber());
                } else {
                    System.out.println("잘못된 입력입니다. 0부터 " + menu.getMenuItems().size() + "까지의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 입력 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
    }
}
