public class Privat24Payment implements PaymentStrategy {


    @Override
    public boolean pay(double price) {
        System.out.format("You paid %2.f UAH through Privat24 successfully.\n", price);
        return true;
    }
}
