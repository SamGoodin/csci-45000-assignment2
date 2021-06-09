package Assignment2.client;

import Assignment2.client.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    ArrayList<Item> items;
    Map<Item, Integer> itemQtys = new HashMap<Item, Integer>();
    Float totalCost;
    int numberOfItems;

    public void checkout() {
        ;
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }

    public void clearCart() {
        items.clear();
    }

    public void changeQty(Item i, int qty) {
        itemQtys.replace(i, qty);
    }

}