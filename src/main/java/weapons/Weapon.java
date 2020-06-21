package weapons;

public interface Weapon {

  String getName();
  void setName(String name);
  TypeOfAttack getTypeOfAttack();
  void setTypeOfAttack(TypeOfAttack typeOfAttack);
  int getReach();
  void setReach(int reach);
  int getLowerRange();
  void setLowerRange(int range);
  int getUpperRange();
  void setUpperRange(int range);
  int getTargets();
  void setTargets(int targets);
  int getNumberOfDamageDice();
  void setNumberOfDamageDice(int numberOfDamageDice);
  int getDamageDiceSize();
  void setDamageDiceSize(int damageDiceSize);
  DamageType getDamageType();
  void setDamageType(DamageType damageType);

}
