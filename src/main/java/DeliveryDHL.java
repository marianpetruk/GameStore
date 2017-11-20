import java.util.List;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i).getSpecifications().getName() + " will be delivered through DHL.");
        }
        return true;
    }
}
