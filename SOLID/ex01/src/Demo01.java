
public class Demo01 {
    public static void main(String[] args) {
        NotificationService emailService = new EmailClient();
        new OrderService(emailService).checkout("a@shop.com", 100.0);
    }
}
