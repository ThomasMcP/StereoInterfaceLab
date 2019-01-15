public class CDPlayer extends Component {

    private int noCDs;

    public CDPlayer(String make, String model, int noCDs){
        super(make, model);
        this.noCDs = noCDs;
    }

    public int getNoCDs(){
        return this.noCDs;
    }

    public String playCD(String songName){
        return "Now playing " + songName + "!";
    }
}
