import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            TarotDeck deck = new TarotDeck();
            deck.cut();
            deck.shuffle();

            while (deck.cardsRemain()) {
                System.out.println("Press enter to deal one card:");
                scanner.nextLine();
                System.out.println(deck.dealOneCard() + "\n");
            }
        }
    }
}
