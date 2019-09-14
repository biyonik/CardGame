import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck extends Hand {
    Random random = new Random();

    public void populate() {
        /*
         *
         *   FOR s in Suit
         *       FOR r in Rank
         *           Card c = new Card(s, r)
         *           cartlist.add(c)
         *       END FOR
         *   END FOR
         *
         */
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
//                c.flipCard();
                this.add(c);
            }
        }
    }

    public void shuffle() {
        for (int i = getCards().size() - 1; i > 0; i--) {
            // Bir rastgele kart ile döngünün son iterasyon değerine denk gelen kart kendi aralarında değiş tokuş yapılır
            int pick = random.nextInt(i);
            Card randCard = getCards().get(pick);
            Card lastCard = getCards().get(i);
            if (randCard.getSuit().name().equals(lastCard.getSuit().name())) {
                randCard = getCards().get(pick);
                lastCard = getCards().get(i);
                if (!randCard.getSuit().name().equals(lastCard.getSuit().name())) {
                    getCards().set(i, randCard);
                    getCards().set(pick, lastCard);
                }

            } else {
                getCards().set(i, randCard);
                getCards().set(pick, lastCard);
            }
        }
    }

    public void deal(Hand[] hands, int perHand) {
        for (int i = 0; i < perHand; i++) {
            for (int j = 0; j < hands.length; j++) {
                this.give(getCards().get(0), hands[j]);
            }
        }
    }

    public void deal(Hand hand, int perHand) {
        for(int i = 0; i < perHand; i++) {
            this.give(getCards().get(0), hand);
        }
    }

    public void flipCard(Card c) {
        c.flipCard();
    }

}
