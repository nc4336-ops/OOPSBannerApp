/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns inside a class using OOPS principles.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding banner pattern.
     */
    public static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         * 
         * @param character the character
         * @param pattern   7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern.
         * 
         * @return String[] pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to create O pattern
    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });
    }

    // Utility method to create P pattern
    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    // Utility method to create S pattern
    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
                "  ****** ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });
    }

    /**
     * Main method - assembles and prints OOPS banner
     */
    public static void main(String[] args) {

        CharacterPattern[] characters = {
                createOPattern(),
                createOPattern(), // reuse O
                createPPattern(),
                createSPattern()
        };

        // Build banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPattern cp : characters) {
                lineBuilder.append(cp.getPattern()[row]);
            }

            System.out.println(lineBuilder.toString());
        }
    }
}