package patterns.facade.subsystem;

public class EmailService {
    public static void sentOrderConfirmationEmail(int orderId) {
        System.out.println("Order " + orderId + " has been successfully placed...");
    }
}
