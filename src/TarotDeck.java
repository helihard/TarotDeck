import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class TarotDeck {
  private final ArrayList<TarotCard> deck = new ArrayList<>();

  public TarotDeck() {
    createDeck();
  }

  public void createDeck() {
    for (MajorArcana majorArcana : MajorArcana.values()) {
      deck.add(new MajorArcanaCard(majorArcana));
    }
    for (MinorArcana.Suit suit : MinorArcana.Suit.values()) {
      for (MinorArcana.Rank rank : MinorArcana.Rank.values()) {
        deck.add(new MinorArcanaCard(suit, rank));
      }
    }
  }
  
  public void cut() {
    SecureRandom randomIntPicker = new SecureRandom();
    int deckSize = deck.size();

    int cutPointOne = randomIntPicker.nextInt(deckSize / 3) + (deckSize / 6);
    int cutPointTwo = randomIntPicker.nextInt(deckSize / 3) + (deckSize / 2);

    ArrayList<TarotCard> partOne = new ArrayList<>(deck.subList(0, cutPointOne));
    ArrayList<TarotCard> partTwo = new ArrayList<>(deck.subList(cutPointOne, cutPointTwo));
    ArrayList<TarotCard> partThree = new ArrayList<>(deck.subList(cutPointTwo, deckSize));
    
    ArrayList<ArrayList<TarotCard>> parts = new ArrayList<>();
    parts.add(partOne);
    parts.add(partTwo);
    parts.add(partThree);

    Collections.shuffle(parts, randomIntPicker);

    deck.clear();
    for (ArrayList<TarotCard> part : parts) {
      deck.addAll(part);
    }
  }

  public void shuffle() {
    SecureRandom secureRandom = new SecureRandom();
    Collections.shuffle(deck, secureRandom);

    int cardsToReverse = deck.size() / 3;
    for (int i = 0; i < cardsToReverse; i++) {
      int randomIndex = secureRandom.nextInt(deck.size());
      deck.get(randomIndex).reverse();
    }
  }

  public TarotCard dealOneCard() {
    if (!deck.isEmpty()) {
      return deck.remove(0);
    }
    return null;
  }

  public boolean cardsRemain() {
    return !deck.isEmpty();
  }
}
