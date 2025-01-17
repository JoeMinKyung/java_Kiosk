package com.example.level6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MenuItem> items = new ArrayList<>();

    // 장바구니에 항목 추가
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // 장바구니 비우기
    public void clearItems() {
        items.clear();
    }

    // 장바구니 항목 출력
    public void printCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        }

        System.out.println("[ Orders ]");
        for (MenuItem item : items) {
            System.out.println(item.toStringWithoutNumber());
        }
    }

    // 총 금액 계산
    public double calculateTotalPrice() {
        return items.stream().mapToDouble(MenuItem::getMenuPrice).sum();
    }
}
