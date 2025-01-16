package patterns.facade.subsystem;

import java.util.Random;

public class PlaceOrder {

    public static Order placeOrder(int code, int qty) {
        Warehouse.modifyInventory(code, qty);

        int orderId = new Random().nextInt(100) + 1;

        Order order = new Order();
        order.setId(orderId);
        order.setItems(new Item(code, qty));
        order.setStatus("PLACED");

        return order;
    }
}
