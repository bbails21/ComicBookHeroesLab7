public class ComicBook {
    private String title;
    private int issue;
    private String hero;
    private int powerLevel;

    public ComicBook(String title, int issue, String hero, int powerLevel) {
        this.title = title;
        this.issue = issue;
        this.hero = hero;
        this.powerLevel = powerLevel;
    }

    public String getTitle() {
        return title;
    }

    public int getIssue() {
        return issue;
    }

    public String getHero() {
        return hero;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String toString() {
        return "Title: " + title + ", Issue: " + issue + ", Hero: " + hero + ", Power Level: " + powerLevel;
    }
}