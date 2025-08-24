public class OrderService {
    private final double taxRate = 0.18;
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    private double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax(subtotal);
        notificationService.sendNotification(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}