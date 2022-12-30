package com.ltp.globalsuperstore.repository;

import com.ltp.globalsuperstore.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }

    public Item getItem(int index){
        return items.get(index);
    }

    public void updateItem(int index, Item item){
        items.set(index, item);
    }
}
