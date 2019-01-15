import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {

    RecordDeck recordDeck;

        @Before
        public void before(){
            recordDeck = new RecordDeck("JVC", "1");
        }

        @Test
        public void hasMake(){
            assertEquals("JVC", recordDeck.getMake());
        }

        @Test
        public void hasModel(){
            assertEquals("1", recordDeck.getModel());
        }

        @Test
        public void hasPlaySpeedsIsZero(){
            assertEquals(0, recordDeck.getPlaySpeedsCount());
        }

        @Test
        public void canPlayRecord(){
            assertEquals("Now playing Thriller!", recordDeck.playRecord("Thriller"));
        }
}
