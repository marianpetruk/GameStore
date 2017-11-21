import java.util.List;

public class CartDecorator extends Cart {
    Cart cartToDecorate;

    CartDecorator(Cart cart) {
        this.cartToDecorate = cart;
    }

    @Override
    public Cart setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.cartToDecorate.setPaymentStrategy(paymentStrategy);
        return this;
    }

    @Override
    public Cart setDelieveryStrategy(DeliveryStrategy delieveryStrategy) {
        cartToDecorate.setDelieveryStrategy(delieveryStrategy);
        return this;
    }

    @Override
    public double computeTotalPrice() {
        double total_price = 0.0;
        for (int i = 0; i < cartToDecorate.games.size(); i++) {
            total_price += cartToDecorate.games.get(i).getPrice();
        }
        return total_price;
    }


    @Override
    public Cart addGame(ComputerGame game) {
        cartToDecorate.games.add(game);
        return this;
    }

    @Override
    public PaymentStrategy getPaymentStrategy() {
        return cartToDecorate.getPaymentStrategy();
    }

    @Override
    public DeliveryStrategy getDeliveryStrategy() {
        return cartToDecorate.getDeliveryStrategy();
    }

    @Override
    public List<ComputerGame> getComputerGames() {
        return this.cartToDecorate.games;
    }

}
