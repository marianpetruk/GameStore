import org.junit.Test;

import static org.junit.Assert.*;

public class BonusDecoratorTest {
    @Test
    public void shipTest() throws Exception {
        assertTrue(new BonusDecorator(new Cart()).ship());
    }

}