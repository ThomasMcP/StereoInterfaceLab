public class MP3Player implements IConnect {
    public String connect(Stereo stereo){
        return "This MP3 Player connected to " + stereo.getName();
    }
}
