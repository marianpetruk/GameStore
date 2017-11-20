import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);
        ComputerStore cs = new ComputerStore();
        ComputerGame csgo = new ComputerGame(CSGOParameters);
        cs.addGame(csgo);

        Cart cart = new DiscountDecorator(new Cart());
        cart.setPaymentStrategy(new PayPalPayment());
        cart.setDelieveryStrategy(new DeliveryDHL());

        cart.addGame(csgo);

        cart.getPaymentStrategy().pay(cart.computeTotalPrice());
        cart.getDeliveryStrategy().deliver(cart.getComputerGames());

    }
}
