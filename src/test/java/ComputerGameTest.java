import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerGameTest {

    @Test
    public void getSpecifications() {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        ComputerGame CSGO = new ComputerGame(CSGOParameters);

        assertTrue(CSGO.getSpecifications().filter(
                new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                        17, CSGOGenres, CSGOPlatforms, 1)
        ));
    }

    @Test
    public void toStringTest() {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        ComputerGame CSGO = new ComputerGame(CSGOParameters);
        assertEquals("ComputerGame{name='CS:GO', description='is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.', price=266.48, ageRestrinct=17, genres=[action], platforms=[GNU/Linux, Windows, MacOS]}", CSGO.toString());
    }

}