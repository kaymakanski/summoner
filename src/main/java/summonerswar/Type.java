package summonerswar;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public enum Type {
    PALADIN(Stars.FIVE_STARS),
    PHOENIX(Stars.FIVE_STARS),
    CHIMERA(Stars.FIVE_STARS),
    ARCHANGEL(Stars.FIVE_STARS),
    SUCCUBUS(Stars.FOUR_STARS),
    HELLHOUND(Stars.THREE_STARS);

    private final Stars defaultStars;

    Type(Stars defaultStars) {
        this.defaultStars = defaultStars;
    }

    public Stars getDefaultStars() {
        return defaultStars;
    }

    public static List<Type> getTypesToStars(Stars stars) {
        return Arrays.asList(values())
                .stream()
                .filter(type -> type.getDefaultStars().equals(stars))
                .collect(Collectors.toList());
    }

    public static Type getRandomTypeForStars(Stars stars) {
        List<Type> types = getTypesToStars(stars);

        return types.get(new Random().nextInt(types.size()));
    }
}
