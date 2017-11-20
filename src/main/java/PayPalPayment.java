public class PayPalPayment implements PaymentStrategy {

    @Override
    public boolean pay(double price) {
        System.out.format("You paid %.2f UAH through PayPal successfully.\n", price);
        return true;
    }
}
