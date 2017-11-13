import org.junit.Test;

import static org.junit.Assert.*;

public class GenreTest {
    @Test
    public void toStringTest() throws Exception {
        assertEquals("action", Genre.ACTION.toString());
        assertEquals("moba", Genre.MOBA.toString());
        assertEquals("simulation", Genre.SIMULATION.toString());


    }

}