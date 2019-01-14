import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> nativeChanger;

    public Changer() {
        this.nativeChanger = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.nativeChanger.add(change);
    }

    public String change(String characterString) {
        String result = characterString;
        for (Change changeToMake : nativeChanger) {
            result = changeToMake.change(result);
        }
        return result;
    }
}
