
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        printFirstAndLastLine(characterString);
        if (characterString.length() % 2 != 0) {
            System.out.println(":) " + characterString + "  :)");
        } else {
            System.out.println(":) " + characterString + " :)");
        }
        printFirstAndLastLine(characterString);
    }

    public static int getLength(String characterString) {
        return characterString.length() % 2 == 0 ? characterString.length() + 6 : characterString.length() + 7;
    }

    public static void printFirstAndLastLine(String smiley) {
        for (int i = 0; i < (getLength(smiley) / 2); i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
}
