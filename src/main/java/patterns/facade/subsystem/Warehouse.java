package patterns.facade.subsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    private static List<Item> inventory = new ArrayList<>();

    static {
        inventory.add(new Item(1, "Tooth Brush", 10));
        inventory.add(new Item(2, "Barbie doll", 5));
    }

    public static List<Item> getInventory() {
        return inventory;
    }

    public static boolean checkInventory(int code, int qty) {
        Item item = inventory
                .stream().filter(i -> i.getCode() == code).findFirst().orElse(null);
        if(item != null) {
            return item.getQuantity() - qty >= 0;
        } else {
            return false;
        }
    }

    public static void modifyInventory(int code, int qty) {
        List<Item> list = new ArrayList<>();
        for (Item item : inventory) {
            if (item.getCode() == code) {
                int remaining = item.getQuantity() - qty;
                if (remaining < 0) {
                    System.out.println("Order cannot be placed as requested qty > available");
                } else {
                    item.setQuantity(remaining);
                    System.out.println("Inventory reduced");
                }
            }
            list.add(item);
        }
        inventory = list;
    }
}
