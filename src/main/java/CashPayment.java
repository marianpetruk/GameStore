public class CashPayment implements PaymentStrategy {

    @Override
    public boolean pay(double price) {
        System.out.format("You paid %2.f UAH successfully by cash.\n", price);
        return true;
    }
}
