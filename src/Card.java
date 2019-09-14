public class Card {

    private Suit suit;
    private Rank rank;
    public boolean isFaceUp = false;

    public Card() {
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }


    public String printRank() {
        return getRank().printRank();
    }

    public void flipCard() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        String str = "";
        if (isFaceUp) {
//            str += rank.getRank()+ " - "+ suit.printSuit();
            str = getSuit().printSuit() + " destesinin " + rank.printRank() + " kartı";
        } else {
            str = "Kartın yüzü kapalı (Herhangi bir değer görüntülenemiyor)";
        }
        return str;
    }
}
