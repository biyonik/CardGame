import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // kart listesini temizler
    public void clear() {
        this.cards.clear();
    }
    // Kart listesine bir kart ekler
    public void add(Card c) {
        this.cards.add(c);
    }

    public String showHand() {
        /*
        * Tüm kartları ve onların değerlerini gösterir
        * fakat sadece kart yüzü görünür olanlar görüntülenebilir
         */
        boolean allFaceUp = true;
        StringBuilder str = new StringBuilder();
        for (Card c : getCards()) {
            str.append(c.toString()).append("\n");
            if(!c.isFaceUp) {
                allFaceUp = false;
            }
        }
        // Eğer tüm kartlar görünür ise toplamı görüntüle
        if(allFaceUp) {
            str.append("Toplam puanınız = "+getTotal()).append("\n");
        }
        return str.toString();
    }

    public void flipCards() {
        for(Card c: getCards()) {
            c.flipCard();
        }
    }

    public boolean give(Card card, Hand otherHand) {
        // eğer kart, kart listesinde yok ise geri dönüş değeri false olsun
        if(!this.cards.contains(card)) {
            return false;
        } else {
            this.cards.remove(card);
            otherHand.add(card);
            return true;
        }
    }

    public int getTotal() {
        int totalPts = 0;
        // As var mı?
        boolean hasAce = false;
        for(int i = 0; i < getCards().size(); i++) {
            totalPts += getCards().get(i).getRank().getRankValue();
            if(getCards().get(i).printRank().equals("AS")) {
                hasAce = true;
            }
            if(hasAce && totalPts <= 11) {
                totalPts += 10;
            }
        }
        return totalPts;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Card c: getCards()) {
            str.append(c.toString()).append("\n");
        }
        return str.toString();
    }
}
