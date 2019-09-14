public enum Rank {
    ACE(1, "AS"), // As
    DEUCE(2, "İkili"), // İkili
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "Vale"), // vale
    QUEEN(10 ,"Kraliçe"), // Kralice
    KING(10, "Kral"); // Kral

    private final int rankValue;
    private final String rankString;

    Rank(int rankValue, String rankString) {
        this.rankValue = rankValue;
        this.rankString = rankString;
    }

    public int getRankValue() {
        return rankValue;
    }
    public String printRank() {
        return rankString;
    }
}
