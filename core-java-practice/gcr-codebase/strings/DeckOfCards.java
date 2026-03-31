import java.util.Scanner;
public class DeckOfCards {
     public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        String CardDeck[] = totalcard(suits, ranks);
        CardDeck = shuffle(CardDeck);

        System.out.println("Enter number of players and cardsperplayer");
        int player = x.nextInt();
        int cardspp = x.nextInt();

        String[][] playersCards = splitcard(CardDeck, player, cardspp);

        if (playersCards != null) {
            printcards(playersCards);
        }  
    }

    public static String[] totalcard(String[] suits, String[] ranks) {
        int totalCards = suits.length * ranks.length;
        String CardDeck[] = new String[totalCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j=0; j < ranks.length; j++) {
                CardDeck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return CardDeck;
    }

    public static String[] shuffle(String[] CardDeck) {

        int size = CardDeck.length;

        for (int i = 0; i< size; i++) {
            int random = i + (int) (Math.random() * (size - i));

            String tempCard = CardDeck[i];
            CardDeck[i] = CardDeck[random];
            CardDeck[random] = tempCard;
        }
        return CardDeck;
    }

    public static String[][] splitcard(String[] CardDeck, int player, int cardsPerPlayer) {

        if (player * cardsPerPlayer > CardDeck.length) {
            System.out.println("Cards cannot be distributed");
            return null;
        }

        String playersCards[][] = new String[player][cardsPerPlayer];

        int deckPointer = 0;
        for (int p = 0; p < player; p++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[p][card] = CardDeck[deckPointer++];
            }
        }
        return playersCards;
    }

    public static void printcards(String[][] playersCards) {

        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }
    }
}
