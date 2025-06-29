import java.util.ArrayList;

public class HeroManager {
    private static ArrayList<Hero> heroList = new ArrayList<>();

    public static void addHero(Hero hero) {
        heroList.add(hero);
    }

    public static void removeHero(String title) {
        heroList.removeIf(hero -> hero.getTitle().equalsIgnoreCase(title));
    }

    public static void searchComic(String[] titles, String[] heroes, String target) {
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equalsIgnoreCase(target)) {
                System.out.println("Found Comic:");
                System.out.println("Title: " + titles[i]);
                System.out.println("Hero: " + heroes[i]);
                return;
            }
        }
        System.out.println("Comic not found: " + target);
    }

    public static double calculateAverage(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}