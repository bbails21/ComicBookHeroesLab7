import java.util.ArrayList;
import java.util.Collections;

public class HeroManager {
    private ArrayList<Hero> heroList;

    public HeroManager() {
        heroList = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroList.add(hero);
    }

    public void removeHero(String name) {
        heroList.removeIf(h -> h.getTitle().equalsIgnoreCase(name));
    }

    public void displayHeroes() {
        for (Hero h : heroList) {
            System.out.println(h);
        }
    }

    public void sortHeroesByPower() {
        Collections.sort(heroList, (a, b) -> b.getPowerLevel() - a.getPowerLevel());
    }

    public ArrayList<Hero> getHeroList() {
        return heroList;
    }
}