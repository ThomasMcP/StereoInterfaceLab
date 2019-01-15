import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStereo {
    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;

    @Before
    public void before(){
        stereo = new Stereo("David");
    }

    @Test
    public void hasName(){
        assertEquals("David", stereo.getName());
    }

    @Test
    public void componentCountZero(){
        assertEquals(0, stereo.componentCount());
    }

    @Test
    public void canAddComponents(){
        stereo.addComponent(radio);
        stereo.addComponent(recordDeck);
        stereo.addComponent(cdPlayer);

        assertEquals(3, stereo.componentCount());
    }
}
