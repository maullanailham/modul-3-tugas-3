package tugas1;

import tugas1.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Menggunakan custom live template "calc_total"
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.totalPrice();
        }
        return total;

    }

    public void displayInvoice() {
        System.out.println("==== Nota Pemesanan ====");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("========================");
        System.out.println("Total: Rp " + calculateTotal());
    }
}
