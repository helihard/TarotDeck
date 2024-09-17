public abstract class TarotCard {
  private boolean isReversed;

  public TarotCard() {
    this.isReversed = false;
  }

  public abstract String getCardName();
  public abstract int getCardNumber();

  public void reverse() {
    this.isReversed = !this.isReversed;
  }

  public boolean isReversed() {
    return isReversed;
  }


  @Override
  public String toString() {
    String cardDescription = getCardName() + (isReversed ? " (Reversed)" : "");

    if (this instanceof MajorArcanaCard) {
      int cardNumber = ((MajorArcanaCard) this).getCardNumber();
      cardDescription = cardNumber + ": " + cardDescription;
    }

    return cardDescription;
  }
}
