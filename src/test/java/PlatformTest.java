import org.junit.Test;

import static org.junit.Assert.*;

public class PlatformTest {
    @Test
    public void toStringTest() throws Exception {
        assertEquals("GNU/Linux", Platform.Linux.toString());
        assertEquals("Windows", Platform.Windows.toString());
        assertEquals("MacOS", Platform.MAC.toString());
        assertEquals("Android", Platform.ANDROID.toString());
        assertEquals("IOS", Platform.IPHONE.toString());

    }

}