package summonerswar;

public enum Stars {
    THREE_STARS(0.915),
    FOUR_STARS(0.08),
    FIVE_STARS(0.005);


    private double possibility;
    Stars(double possibility) {
        this.possibility = possibility;
    }

    public double getPossibility() {
        return possibility;
    }

    public static final Stars DEFAULT_STARS = THREE_STARS;
}
