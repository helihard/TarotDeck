public class MinorArcanaCard extends TarotCard {
  private final MinorArcana.Suit suit;
  private final MinorArcana.Rank rank;

  public MinorArcanaCard(MinorArcana.Suit suit, MinorArcana.Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String getCardName() {
    return formatEnum(rank) + " of " + formatEnum(suit);
  }

  @Override
  public int getCardNumber() {
    return -1;
  }

  private String formatEnum(Enum<?> e) {
    String name = e.name().toLowerCase();
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }
}
