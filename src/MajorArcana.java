public enum MajorArcana {
    THE_FOOL(0, "The Fool"),
    THE_MAGICIAN(1, "The Magician"),
    THE_HIGH_PRIESTESS(2, "The High Priestess"),
    THE_EMPRESS(3, "The Empress"),
    THE_EMPEROR(4, "The Emperor"), 
    THE_HIEROPHANT(5, "The Hierophant"),
    THE_LOVERS(6, "The Lovers"),
    THE_CHARIOT(7, "The Chariot"),
    JUSTICE(8, "Justice"),
    THE_HERMIT(9, "The Hermit"),
    WHEEL_OF_FORTUNE(10, "Wheel of Fortune"),
    STRENGTH(11, "Strength"),
    THE_HANGED_MAN(12, "The Hanged Man"),
    DEATH(13, "Death"),
    TEMPERANCE(14, "Temperance"),
    THE_DEVIL(15, "The Devil"),
    THE_TOWER(16, "The Tower"),
    THE_STAR(17, "The Star"),
    THE_MOON(18, "The Moon"),
    THE_SUN(19, "The Sun"),
    JUDGEMENT(20, "Judgement"),
    THE_WORLD(21, "The World");

  private final int number;
  private final String name;

  // constructor with enums
  MajorArcana(int number, String name) {
    this.number = number;
    this.name = name;
  }

  // number getter
  public int getNumber() {
    return number;
  }

  // name getter
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return this.number + ": " + this.name;
  }
}
