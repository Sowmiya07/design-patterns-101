package patterns.facade;

import patterns.facade.subsystem.*;

public class Facade {

    void order(int product, int qty) {
        boolean eligible = ValidateOrder.validate(product, qty);

        if(!eligible) {
            System.out.println("Not eligible for placing an order");
        } else {
            Order order = PlaceOrder.placeOrder(product, qty);

            EmailService.sentOrderConfirmationEmail(order.getId());
        }

    }

    void displayInventory() {
        Warehouse.getInventory()
                .forEach(System.out::println);
    }

}
