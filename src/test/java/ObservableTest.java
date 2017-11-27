import org.junit.Test;

import static org.junit.Assert.*;

public class ObservableTest {
    @Test
    public void addObserverTest() throws Exception {
        Observable observable = new Observable();
        Seller seller = new Seller();
        assertTrue(observable.addObserver(seller));
    }

    @Test
    public void removeObserverTest() throws Exception {
        Observable observable = new Observable();
        Seller seller = new Seller();
        observable.addObserver(seller);
        assertTrue(observable.removeObserver(seller));
    }

    @Test
    public void notifyObserversTest() throws Exception {
        Observable observable = new Observable();
        Seller seller = new Seller();
        observable.addObserver(seller);
        assertTrue(observable.notifyObservers());
    }

}