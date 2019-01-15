import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCDPlayer {

    CDPlayer cDPlayer;

    @Before
    public void before(){
        cDPlayer = new CDPlayer("JVC", "1", 4);
    }

    @Test
    public void hasMake(){
        assertEquals("JVC", cDPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("1", cDPlayer.getModel());
    }

    @Test
    public void hasNoCDs(){
        assertEquals(4, cDPlayer.getNoCDs());
    }

    @Test
    public void canPlayCD(){
        assertEquals("Now playing Thriller!", cDPlayer.playCD("Thriller"));
    }
}
