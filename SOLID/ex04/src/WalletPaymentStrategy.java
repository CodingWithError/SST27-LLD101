public class WalletPaymentStrategy implements PaymentStrategy {
  @Override
  public String formatPayment(Payment payment) {
    return "Wallet debit: " + payment.amount;
  }
}
