public class Main {
    public static void main(String[] args) {
        // Step 1: Create arrays for comic book data
        String[] titles = {"Spider-Man", "Iron Man", "Captain Marvel"};
        int[] issues = {1, 2, 3};
        String[] heroes = {"Peter Parker", "Tony Stark", "Carol Danvers"};
        int[] powerLevels = {85, 90, 95};

        // Step 2: Print comic book info using a loop
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Title: " + titles[i]);
            System.out.println("Issue #: " + issues[i]);
            System.out.println("Hero: " + heroes[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }

        // Step 3: Call search method
        HeroManager.searchComic(titles, heroes, "Iron Man");

        // Step 4: Call average power method
        double avg = HeroManager.calculateAverage(powerLevels);
        System.out.println("Average Power Level: " + avg);
    }
}