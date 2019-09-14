public enum Rank {
    ACE(1), // As
    DEUCE(2), // İkili
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10), // vale
    QUEEN(10), // Kralice
    KING(10); // Kral

    private final int rankValue;

    Rank(int rankValue) {
        this.rankValue = rankValue;
    }

    public int getRank(){
        return rankValue;
    }
}
