import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio("JVC", "1");
    }

    @Test
    public void hasMake(){
        assertEquals("JVC", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("1", radio.getModel());
    }

    @Test
    public void canTune(){
        assertEquals("You are tuned to Radio 1", radio.tune("Radio 1"));
    }
}
