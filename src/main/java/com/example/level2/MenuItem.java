package com.example.level2;

public class MenuItem {
    private String menuName;
    private double menuPrice;
    private String menuDescription;

    // 생성자
    public MenuItem(String menuName, double menuPrice, String menuDescription) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    // Getter
    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    // 메뉴 출력
    @Override
    public String toString() {
        return String.format("%s   | W %.1f | %s", menuName, menuPrice, menuDescription);
    }
}
