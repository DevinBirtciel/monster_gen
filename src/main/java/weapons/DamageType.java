package weapons;

public enum DamageType {
  BLUDGEONING("bludgeoning"), PIERCING("piercing");
  private String damageType;
  DamageType(String damageType){
    this.damageType = damageType;
  }
  public String getDamageType(){
    return damageType;
  }
}
