package com.example.level7;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName; // 카테고리 이름
    private List<MenuItem> menuItems = new ArrayList<>(); // 메뉴 항목 리스트
    private int itemCount = 1; // 카테고리별로 메뉴 번호 초기화

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
    }

    // 메뉴 항목 추가 (카테고리별 번호 관리)
    public void addMenuItem(String name, double price, String description) {
        MenuItem menuItem = new MenuItem(itemCount++, name, price, description);
        menuItems.add(menuItem);
    }

    // 카테고리 이름 반환 (Getter)
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 리스트 반환 (Getter)
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 카테고리 내 메뉴 항목 출력
    public void printMenuItems() {
        for(MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }
}
