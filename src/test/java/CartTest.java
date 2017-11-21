import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CartTest {
    Cart cart1 = new Cart();
    Cart cart2 = cart1;
    ComputerStore cs;


    @Test
    public void computeTotalPrice() throws Exception {
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
    public void ship() throws Exception {
        assert (cart1.ship() == true);
        assert (cart2.ship() == true);
    }

    @Test
    public void addGame() throws Exception {
        assert (cart1 == cart2);
    }

    @Test
    public void getComputerGames() throws Exception {
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

        assert (cart3.getComputerGames().size() == 1);

    }

    @Test
    public void getPaymentStrategy() throws Exception {
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
    public void getDeliveryStrategy() throws Exception {

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