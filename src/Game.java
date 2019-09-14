import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        // Deste oluşturma
        Deck deck1 = new Deck();
        deck1.populate();
        deck1.shuffle();

        // Oyuncunun eli oluşturuluyor
        Hand h1, h2, h3, dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();
        Hand[] hands = {h1, h2, h3};
        deck1.deal(hands, 2);

        deck1.deal(dealer, 2);

        for (int i = 0; i < hands.length; i++) {
            hands[i].flipCards();
            System.out.println(hands[i].showHand());
            System.out.println("------------------------------------");
        }

        dealer.getCards().get(0).flipCard();
        System.out.println("\nKrupiyenin kartları:\n"+dealer.showHand());
    }
}
