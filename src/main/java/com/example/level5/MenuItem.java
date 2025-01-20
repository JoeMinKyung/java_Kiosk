package com.example.level5;

public class MenuItem {
    private static int count = 1; // 메뉴 번호 증가 변수
    private int menuNumber; // 메뉴 번호
    private String menuName;
    private double menuPrice;
    private String menuDescription;

    // 생성자
    public MenuItem(int menuNumber, String menuName, double menuPrice, String menuDescription) {
        this.menuNumber = menuNumber;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    // Getter
    public int getMenuNumber() {
        return menuNumber;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    // Setter
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    // 메뉴 출력
    @Override
    public String toString() {
        return String.format("%d. %-14s | W %.1f | %s", menuNumber, menuName, menuPrice, menuDescription);
    }

    // selectedMenuItem 출력
    public String toStringWithoutNumber() {
        return String.format("%s | W %.1f | %s", menuName, menuPrice, menuDescription);
    }
}

