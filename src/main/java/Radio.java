public class Radio extends Component {

    public Radio(String make, String model){
        super(make, model);
    }

    public String tune(String radioStation){
        return "You are tuned to " + radioStation;
    }

}
