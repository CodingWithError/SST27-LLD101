public class UPIPaymentStrategy implements PaymentStrategy {
  @Override
  public String formatPayment(Payment payment) {
    return "Paid via UPI: " + payment.amount;
  }
}
