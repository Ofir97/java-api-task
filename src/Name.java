public enum Name {

    MOSHE, DAVID, JACK, TAL, DANIEL;

    public static String getRandName() {
        return Name.values()[((int)(Math.random() * Name.values().length))].name().toLowerCase();
    }
}
