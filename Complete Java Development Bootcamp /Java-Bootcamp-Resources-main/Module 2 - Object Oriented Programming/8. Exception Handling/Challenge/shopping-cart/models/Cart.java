package models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }
    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }
    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }
   /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */
    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        } else {
            this.items.add(item);
            return true;
        }
    }
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("no items in cart to remove!");
        }
        for (int i = 0; i < this.items.size(); i++) {
            if(this.items.get(i).getName().equalsIgnoreCase(name)){
                this.items.remove(i);
            }
        }
    }
   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("no items in cart to remove!");
        }
        double subTotal = 0;
        double taxAmount = 0;
        double total = 0;
        for (int i = 0; i < this.items.size(); i++) {
            subTotal += this.items.get(i).getPrice();
        }
        taxAmount = subTotal * .13;
        total = subTotal + taxAmount;

        return "\tRECEIPT\n\n" +
            "\tSubtotal: $" + subTotal + "\n" +
            "\tTax: $" + taxAmount + "\n" +
            "\tTotal: $" + total + "\n";
    }
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i);
            temp += "\n";
        }
        return temp;
    }
}
