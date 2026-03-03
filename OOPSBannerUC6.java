public class OOPSBannerUC6 {

    public static void main(String[] args) {

        // Get individual character patterns
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Assemble banner lines
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("",
                    O[i],   // First O
                    O[i],   // Second O (reuse method)
                    P[i],
                    S[i]
            );
        }

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper Method for Letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Helper Method for Letter P
    public static String[] getPPattern() {
        return new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Helper Method for Letter S
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }
}