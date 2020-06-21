package weapons;

public enum TypeOfAttack {
  MELEE_WEAPON_ATTACK("Melee Weapon Attack"), RANGED_WEAPON_ATTACK("Ranged Weapon Attack"), MELEE_OR_RANGED_WEAPON_ATTACK("Melee or Ranged Weapon Attack");

  private String typeOfAttack;

  TypeOfAttack(String typeOfAttack){
    this.typeOfAttack = typeOfAttack;
  }

  public String getTypeOfAttack(){
    return typeOfAttack;
  }
}
