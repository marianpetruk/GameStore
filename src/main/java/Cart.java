import java.util.ArrayList;
import java.util.List;

public class Cart extends Observable {
    List<ComputerGame> games;

    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;


    Cart() {
        this.games = new ArrayList<>();
    }


    public Cart setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        return this;
    }

    public Cart setDelieveryStrategy(DeliveryStrategy delieveryStrategy) {
        this.deliveryStrategy = delieveryStrategy;
        return this;
    }

    public double computeTotalPrice() {
        double total_price = 0.0;
        for (int i = 0; i < this.games.size(); i++) {
            total_price += this.games.get(i).getPrice();
        }
        return total_price;
    }

    public boolean ship() {
        return true;
    }

    public Cart addGame(ComputerGame game) {
        this.games.add(game);
        return this;
    }

    public List<ComputerGame> getComputerGames() {
        return this.games;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }


}
