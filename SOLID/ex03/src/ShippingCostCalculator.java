public class ShippingCostCalculator {
    private final ShippingStrategyRepository strategyRepository;

    public ShippingCostCalculator() {
        this.strategyRepository = new ShippingStrategyRepository();
    }

    public ShippingCostCalculator(ShippingStrategyRepository strategyRepository) {
        this.strategyRepository = strategyRepository;
    }

    double cost(Shipment s) {
        ShippingStrategy strategy = strategyRepository.getStrategy(s.type);
        return strategy.calculateCost(s.weightKg);
    }
}
