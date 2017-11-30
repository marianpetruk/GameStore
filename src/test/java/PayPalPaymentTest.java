import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PayPalPaymentTest {
    @Test
    public void payTest() throws Exception {
        ComputerStore cs;
        cs = new ComputerStore();
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);
        ComputerGame csgo = new ComputerGame(CSGOParameters);
        cs.addGame(csgo);
        Cart cart = new DiscountDecorator(new Cart());
        cart.setPaymentStrategy(new PayPalPayment());
        cart.setDelieveryStrategy(new DeliveryDHL());

        cart.addGame(csgo);
        assertTrue(cart.getPaymentStrategy().pay(cart.computeTotalPrice()));

    }

}