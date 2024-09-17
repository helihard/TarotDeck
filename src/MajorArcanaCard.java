public class MajorArcanaCard extends TarotCard {
  private final MajorArcana majorArcana;

  public MajorArcanaCard(MajorArcana majorArcana) {
    this.majorArcana = majorArcana;
  }

  @Override
  public String getCardName() {
    return majorArcana.getName();
  }

  @Override
  public int getCardNumber() {
    return majorArcana.getNumber();
  }
}
