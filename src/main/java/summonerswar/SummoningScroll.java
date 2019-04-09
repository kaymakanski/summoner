package summonerswar;

public class SummoningScroll {
    public static Monster generateMonster() {
        Stars stars = generateStars();

        Type type = Type.getRandomTypeForStars(stars);


        Monster monster = new Monster(type);

        return monster;
    }

    private static Stars generateStars() {
        double random = Math.random();
        double accumulatedPossibility = 0;
        for (Stars star : Stars.values()) {
            accumulatedPossibility += star.getPossibility();

            if(random <= accumulatedPossibility) {
                return star;
            }
        }

        return Stars.DEFAULT_STARS;
    }


}
