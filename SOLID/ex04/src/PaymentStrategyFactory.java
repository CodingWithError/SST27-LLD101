public class PaymentStrategyFactory {
  public static PaymentStrategy getStrategy(String provider) {
    switch (provider) {
      case "CARD":
        return new CardPaymentStrategy();
      case "UPI":
        return new UPIPaymentStrategy();
      case "WALLET":
        return new WalletPaymentStrategy();
      default:
        throw new RuntimeException("No provider");
    }
  }
}
