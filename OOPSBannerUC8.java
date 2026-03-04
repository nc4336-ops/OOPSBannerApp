import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Use HashMap for Character Patterns
 * Displays OOPS in Banner Format
 */
public class OOPSBannerUC8 {

    /**
     * Utility method to create and return character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return patterns;
    }

    /**
     * Method to print banner using HashMap
     */
    public static void printBanner(String word, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterPatterns();

        String word = "OOPS";

        printBanner(word, characterPatterns);
    }
}