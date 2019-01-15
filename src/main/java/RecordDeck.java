import java.util.ArrayList;

public class RecordDeck extends Component {

    ArrayList<Integer> playSpeeds;

    public RecordDeck(String make, String model){
        super(make, model);
        this.playSpeeds = new ArrayList<>();
    }


    public int getPlaySpeedsCount() {
        return this.playSpeeds.size();
    }

    public String playRecord(String record) {
        return "Now playing " + record + "!";
    }
}
