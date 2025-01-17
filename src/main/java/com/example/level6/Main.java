package com.example.level6;

public class Main {
    public static void main(String[] args) {
        // Menu와 MenuItem 초기화
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgerMenu.addMenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgerMenu.addMenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgerMenu.addMenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem("Coke", 2.0, "시원한 콜라");
        drinkMenu.addMenuItem("Lemonade", 2.5, "상큼한 레모네이드");

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem("Vanilla Custard", 3.5, "부드러운 바닐라 커스터드");
        dessertMenu.addMenuItem("Chocolate Shake", 4.0, "진한 초콜릿 쉐이크");

        // 메뉴를 Kiosk에 추가
        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        // Kiosk 실행
        kiosk.start();
    }
}
