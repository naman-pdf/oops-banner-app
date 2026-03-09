public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    public static void printBanner(String word) {

        if (word.equals("OOPS")) {

            String[] banner = {
                " *****    *****    *****    ***** ",
                "*     *  *     *  *     *  *     *",
                "*     *  *     *  *     *  *     *",
                "*     *  *     *  *     *  *     *",
                "*     *  *     *  *     *  *     *",
                "*     *  *     *  *     *  *     *",
                " *****    *****    *****    ***** "
            };

            for (String line : banner) {
                System.out.println(line);
            }

        }

    }

}