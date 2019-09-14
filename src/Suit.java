public enum Suit {
    HEARTS("Kupa"),
    SPADES("Maça"),
    DIAMONDS("Karo"),
    CLUBS("Sinek");


    private final String suitText;
    // Yapıcı Metot
    Suit(String suitText) {
        this.suitText = suitText;
    }

    public String printSuit() {
        return suitText;
    }
}
