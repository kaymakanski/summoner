import org.junit.Assert;
import org.junit.Test;
import summonerswar.Monster;
import summonerswar.Type;

public class TestCalculateBaseStats {

    @Test
    public void testArchangel() {
        Monster monster = new Monster(Type.ARCHANGEL);

        Assert.assertEquals(0, monster.getExperience());
        Assert.assertEquals(100, monster.getHp());
    }

    @Test
    public void testMonsterStarUpgrade() {
        Monster monster = new Monster(Type.HELLHOUND);
        monster.addExperience(1000);


        monster.upgradeStars();
        Assert.assertEquals(0, monster.getExperience());
        Assert.assertEquals(50, monster.getHp());
    }

    @Test
    public void testLevelUpScaleNonSpec(){
        Monster monster = new Monster(Type.CHIMERA);

        Assert.assertEquals(0, monster.getExperience());
        Assert.assertEquals(50, monster.getHp());

        monster.addExperience(1000);


        Assert.assertEquals(1000, monster.getExperience());
        Assert.assertEquals(90, monster.getHp());
    }
}
