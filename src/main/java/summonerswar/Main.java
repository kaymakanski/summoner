package summonerswar;

public class Main {
    public static void main(String args[]){
        boolean gotFiveStars = false;
        int tries = 0;

        Monster monster = null;

        while(!gotFiveStars) {
            tries++;

            monster = SummoningScroll.generateMonster();
            System.out.println(monster);

            gotFiveStars = monster.getStars().equals(Stars.FIVE_STARS);
        }

        System.out.printf("%d tries and monster: %s", tries, monster.toString());

    }
}
