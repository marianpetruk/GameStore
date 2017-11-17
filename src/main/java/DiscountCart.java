public class DiscountCart extends Cart{
    public Cart cart;
    public DiscountCart(Cart cart){
        this.cart = cart;
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        cart.setPaymentStrategy(paymentStrategy);
    }

    public void setDelieveryStrategy(Delivery delieveryStrategy) {
        cart.setDelieveryStrategy(delieveryStrategy);
    }


    public double computeTotalPrice() {
        return cart.computeTotalPrice() * 0.9;
    }

    public void ship() {
        cart.ship();
    }

    public void addGame(ComputerGame game){
        cart.addGame(game);

    }

}
