package tugas1;

import tugas1.Item;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Menambahkan item ke dalam pesanan
        order.addItem(new Item("Nasi Goreng", 15000, 2));
        order.addItem(new Item("Es Teh", 5000, 1));
        order.addItem(new Item("Ayam Goreng", 12000, 1));

        // Menampilkan nota
        order.displayInvoice();
    }
}
