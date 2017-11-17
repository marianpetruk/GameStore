import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerGameParametersTest {

    @Test
    public void getDescription() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals("is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", CSGOParameters.getDescription());
    }

    @Test
    public void getName() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals("CS:GO", CSGOParameters.getName());
    }

    @Test
    public void getGenres() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals(CSGOGenres, CSGOParameters.getGenres());
    }

    @Test
    public void getPlatforms() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals(CSGOPlatforms, CSGOParameters.getPlatforms());

    }

    @Test
    public void getPrice() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        System.out.println(CSGOParameters.getPrice());

        assertEquals(266.48, CSGOParameters.getPrice(), 1e-15);

    }

    @Test
    public void getAgeRestriction() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals(17, CSGOParameters.getAgeRestriction());

    }

    @Test
    public void getGameId() throws Exception {
        ArrayList<Genre> CSGOGenres = new ArrayList<Genre>();
        CSGOGenres.add(Genre.ACTION);
        ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
        CSGOPlatforms.add(Platform.Linux);
        CSGOPlatforms.add(Platform.Windows);
        CSGOPlatforms.add(Platform.MAC);
        ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
                17, CSGOGenres, CSGOPlatforms, 1);

        assertEquals(1, CSGOParameters.getGameId());

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

        assertEquals("ComputerGameParameters{name='CS:GO', description='is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.', price=266.48, ageRestrinct=17, genres=[action], platforms=[GNU/Linux, Windows, MacOS], gameId=1}", CSGOParameters.toString());
    }

}