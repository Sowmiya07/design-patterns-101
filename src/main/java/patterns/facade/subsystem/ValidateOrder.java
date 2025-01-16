package patterns.facade.subsystem;

public class ValidateOrder {

    public static boolean validate(int productCode, int quantity) {
        return Warehouse.checkInventory(productCode, quantity);
    }

}
