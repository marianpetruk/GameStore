import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class ComputerStoreTest {
    @Test
    public void ComputerStoreClassTest() {
        ComputerStore GameStore = new ComputerStore();
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);
        ComputerGame CSGO = new ComputerGame(CSGOParameters);
        ComputerGameParameters CSGOParameters1 = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                19, CSGOGenres, CSGOPlatforms, 1);

        ComputerGame CSGO1 = new ComputerGame(CSGOParameters1);

        GameStore.addGame(CSGO);

//        assertTrue(GameStore.getNumberOfGameAvailable() == 1);
        assertEquals("NumberOfGames", 1, GameStore.getNumberOfGameAvailable());
        assertEquals("GameName", "CS:GO", GameStore.getComputerGames().get(0).getSpecifications().getName());

        assertTrue(GameStore.addGame(CSGO));
        assertTrue(GameStore.removeGame(CSGO));
        assertTrue((GameStore.removeGame(CSGO1)));
        assertEquals(GameStore.search(CSGOParameters).get(0).getSpecifications().getName(), "CS:GO");
    }


}