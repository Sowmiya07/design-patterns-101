package patterns.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.displayInventory();
        facade.order(1, 2);
        facade.displayInventory();
        facade.order(3, 2);
        facade.displayInventory();
    }



}
