package com.css.dp.builder.cases;

import com.css.dp.builder.ifs.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
