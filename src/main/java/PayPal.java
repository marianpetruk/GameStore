public class PayPal implements PaymentStrategy {

    @Override
    public boolean pay(double price) {
        System.out.format("You paid %2.f UAH successfully through PayPal.\n", price);
        return true;
    }
}
