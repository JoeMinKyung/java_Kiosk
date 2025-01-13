package com.example.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);
    private List<MenuItem> menuItems;

    // 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 프로그램 시작 메서드
    public void start(){
        while (true) {
            printMenu(); // 메뉴 출력

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
                if (orderNumber > 0 && orderNumber <= menuItems.size()) {
                    // 선택된 메뉴 출력
                    MenuItem selectedItem = menuItems.get(orderNumber - 1);
                    System.out.println(selectedItem);
                } else {
                    System.out.println("잘못된 입력입니다. 0부터 " + menuItems.size() + "까지의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 입력 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
            System.out.println();
        }
    }

    // 메뉴 출력 메서드
    private void printMenu() {
        // 햄버거 메뉴 출력
        System.out.println("[ SHAKESHACK MENU ]");
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
        System.out.println("0. 종료      | 종료");
    }
}
