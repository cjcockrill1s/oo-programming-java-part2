import java.util.Scanner;
import java.util.stream.Stream;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: \n " +
                "add - adds a word pair to the dictionary \n  " +
                "quit - quit the text user interface \n " +
                "translate - asks a word and prints it's translation");

        while (true) {
            System.out.println("Statement: ");
            String userInput = this.reader.nextLine();
            if (userInput.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (userInput.equals("add")) {
                add();
            } else if (userInput.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.println("In Finnish:");
        String inFinnish = this.reader.nextLine();
        System.out.println("Translation:");
        String translation = this.reader.nextLine();
        this.dictionary.add(inFinnish, translation);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String userInput = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(userInput));
    }
}
