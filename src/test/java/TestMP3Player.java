import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMP3Player {
    MP3Player mp3Player;
    Stereo stereo;

    @Before
    public void before(){
        mp3Player = new MP3Player();
        stereo = new Stereo("Jimmy");
    }

    @Test
    public void canConnect(){
        assertEquals("This MP3 Player connected to Jimmy", mp3Player.connect(stereo));
    }
}
