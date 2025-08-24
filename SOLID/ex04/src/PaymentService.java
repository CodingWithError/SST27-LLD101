
public class PaymentService {
    String pay(Payment p) {
        if (p == null || p.provider == null || p.amount <= 0) {
            throw new IllegalArgumentException("Invalid payment details");
        }

        boolean paymentProcessed = processPayment(p);

        if (paymentProcessed) {
            PaymentStrategy strategy = PaymentStrategyFactory.getStrategy(p.provider);
            return strategy.formatPayment(p);
        } else {
            throw new RuntimeException("Payment processing failed");
        }
    }

    private boolean processPayment(Payment p) {
        return true;
    }
}