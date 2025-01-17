package com.example.level6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MenuItem> items = new ArrayList<>();

    // 장바구니에 항목 추가
    public void addItem(MenuItem item) {
        items.add(item);
    }


}
