import java.util.HashMap;
import java.util.Map;

public class ShippingStrategyRepository {
  private final Map<String, ShippingStrategy> strategies;

  public ShippingStrategyRepository() {
    strategies = new HashMap<>();
    strategies.put("STANDARD", new StandardShippingStrategy());
    strategies.put("EXPRESS", new ExpressShippingStrategy());
    strategies.put("OVERNIGHT", new OvernightShippingStrategy());
  }

  public ShippingStrategy getStrategy(String type) {
    ShippingStrategy strategy = strategies.get(type);
    if (strategy == null) {
      throw new IllegalArgumentException("Unknown shipping type: " + type);
    }
    return strategy;
  }

  public void addStrategy(String type, ShippingStrategy strategy) {
    strategies.put(type, strategy);
  }
}
