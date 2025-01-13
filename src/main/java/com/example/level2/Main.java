package com.example.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();
        int orderNumber;

        // MenuItem 객체 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (true) {
            // 햄버거 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem menuItem : menuItems) {
                System.out.println(menuItem);
            }
            System.out.println("0. 종료      | 종료");

            // 숫자 입력
            String input = sc.nextLine();

            try {
                // 입력 값 숫자로 변환
                orderNumber = Integer.parseInt(input);

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
        sc.close();
    }
}
