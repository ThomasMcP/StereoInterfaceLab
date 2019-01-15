import java.util.ArrayList;

public class Stereo {

    private String name;
    private ArrayList<Component> components;

    public Stereo(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int componentCount(){
        return components.size();
    }

    public void addComponent(Component component){
        this.components.add(component);
    }
}
