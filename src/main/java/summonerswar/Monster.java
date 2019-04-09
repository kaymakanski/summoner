package summonerswar;

public class Monster {
    private Stars stars;
    private Type type;

    private int experience;


    public Monster(Type type){
        this.type = type;
        this.stars = type.getDefaultStars();
    }

    @Override
    public String toString() {
        return "summonerswar.Monster{" +
                "stars=" + stars +
                ", type=" + type +
                ", experience=" + experience +
                '}';
    }

    public Stars getStars() {
        return stars;
    }

    public int getExperience() {
        return experience;
    }

    // TODO implement
    public int getHp() {
        return 0;
    }

    public void addExperience(int experience) {
        this.experience += experience;
    }

    // TODO implement
    public void upgradeStars() {

    }
}
