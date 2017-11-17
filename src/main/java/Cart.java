//import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<ComputerGame> games;

//    private ArrayList<ComputerGame> games;
    private PaymentStrategy paymentStrategy;
    private Delivery deliveryStrategy;

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Delivery getDelieveryStrategy() {
        return deliveryStrategy;
    }

    public void setDelieveryStrategy(Delivery delieveryStrategy) {
        this.deliveryStrategy = delieveryStrategy;
    }


    public double computeTotalPrice() {
        return 100.500;
    }

    public void ship() {
        if (paymentStrategy.pay(computeTotalPrice())) {
            deliveryStrategy.deliver(games);
        }
    }

    public void addGame(ComputerGame game){
        games.add(game);
    }

}
