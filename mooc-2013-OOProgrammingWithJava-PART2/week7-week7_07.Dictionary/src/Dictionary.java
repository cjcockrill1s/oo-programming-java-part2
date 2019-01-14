import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        return this.dictionary.get(word) != null ? this.dictionary.get(word) : null;
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translatedWords = new ArrayList<String>();
        for (String key : this.dictionary.keySet()) {
            translatedWords.add(key + " = " + translate(key));
        }
        return translatedWords;
    }
}
