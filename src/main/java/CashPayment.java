public class CashPayment implements PaymentStrategy {

    @Override
    public boolean pay(double price) {
        System.out.format("You paid %2.f UAH by cash successfully.\n", price);
        return true;
    }
}
