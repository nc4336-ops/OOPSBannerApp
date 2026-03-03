public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Step 1: Create String Array to store banner lines
        String[] banner = new String[7];

        // Step 2: Populate each line using String.join()
        banner[0] = String.join("",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  ****** ");

        banner[1] = String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ");

        banner[2] = String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        banner[3] = String.join("",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  ");

        banner[4] = String.join("",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        banner[5] = String.join("",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * ");

        banner[6] = String.join("",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  ");

        // Step 3: Use Enhanced For Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}