import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.*;

public class CartTest {
    Cart cart1 = new Cart();
    Cart cart2 = cart1;
    ComputerStore cs;


    @Test
    public void computeTotalPriceTest() throws Exception {
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
//        cart2.addGame(csgo);
        Cart cart3 = new DiscountDecorator(new Cart());
        cart3.setPaymentStrategy(new PayPalPayment());
        cart3.setDelieveryStrategy(new DeliveryDHL());

        cart3.addGame(csgo);


        assert (cart3.computeTotalPrice() == 266.48 * 0.5);
    }

    @Test
    public void shipTest() throws Exception {
        assertTrue(cart1.ship());
        assertTrue(cart2.ship());
    }

    @Test
    public void addGameTest() throws Exception {
        assert (cart1 == cart2);
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

        assertTrue( cs.addGame(csgo));
    }

    @Test
    public void getComputerGamesTest() throws Exception {
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
//      cart2.addGame(csgo);
        Cart cart3 = new DiscountDecorator(new Cart());
        cart3.setPaymentStrategy(new PayPalPayment());
        cart3.setDelieveryStrategy(new DeliveryDHL());

        cart3.addGame(csgo);
        Cart cartTest = new DiscountDecorator(new Cart());
        cartTest.setPaymentStrategy(new PayPalPayment());
        cartTest.setDelieveryStrategy(new DeliveryDHL());
        cartTest.addGame(csgo);

        assert (cart3.getComputerGames().size() == 1);
        assert(Objects.equals(cart3.getComputerGames(), cartTest.getComputerGames()));

    }

    @Test
    public void getPaymentStrategyTest() throws Exception {
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
//        cart2.addGame(csgo);
        Cart cart3 = new DiscountDecorator(new Cart());
        cart3.setPaymentStrategy(new PayPalPayment());
        cart3.setDelieveryStrategy(new DeliveryDHL());

        cart3.addGame(csgo);

        assert (cart3.getPaymentStrategy().getClass().getName() == "PayPalPayment");
    }

    @Test
    public void getDeliveryStrategyTest() throws Exception {

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
//        cart2.addGame(csgo);
        Cart cart3 = new DiscountDecorator(new Cart());
        cart3.setPaymentStrategy(new PayPalPayment());
        cart3.setDelieveryStrategy(new DeliveryDHL());

        cart3.addGame(csgo);

        assert (cart3.getDeliveryStrategy().getClass().getName() == "DeliveryDHL");

    }

}