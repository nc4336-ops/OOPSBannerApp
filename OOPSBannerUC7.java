/**
 * UC7 - Store Character Pattern in a Class using Inner Static Class
 * Displays OOPS in Banner Format
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character banner character
         * @param pattern pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern of a character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char c) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == c) {
                return cp.getPattern();
            }
        }

        return new String[7];
    }

    /**
     * Method to print banner
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = getCharacterPattern(patterns, c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        CharacterPatternMap[] characterPatterns = {O, P, S};

        printBanner("OOPS", characterPatterns);
    }
}