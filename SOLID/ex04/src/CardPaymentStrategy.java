public class CardPaymentStrategy implements PaymentStrategy {
  @Override
  public String formatPayment(Payment payment) {
    return "Charged card: " + payment.amount;
  }
}
