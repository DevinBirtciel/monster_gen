package weapons;

import utilities.Utilities;

public class PrintWeapon {

  public static String printWeaponDescription(Weapon weapon, int toHit, int relevantModifier){

    int averageDamage = Utilities.calculateAverageDamage(weapon.getNumberOfDamageDice(), weapon.getDamageDiceSize(), relevantModifier);

    String toHitString = "+" + toHit + " to hit, ";

    String reachAndRangeString;
    if(weapon.getTypeOfAttack() == TypeOfAttack.MELEE_WEAPON_ATTACK){
      reachAndRangeString = "reach " + weapon.getReach() + " ft., ";
    } else if (weapon.getTypeOfAttack() == TypeOfAttack.RANGED_WEAPON_ATTACK) {
      reachAndRangeString = "range " + weapon.getLowerRange() + "/" + weapon.getUpperRange() + " ft., ";
    } else {
      reachAndRangeString = "reach " + weapon.getReach() + " ft. or range " + weapon.getLowerRange() + "/" + weapon.getUpperRange() + " ft., ";
    }

    String damageDiceString;
    if(relevantModifier < 0){
      damageDiceString = "(" + weapon.getNumberOfDamageDice() + "d" + weapon.getDamageDiceSize() + " - " + Math.abs(relevantModifier) + ")";
    } else if (relevantModifier == 0){
      damageDiceString = "(" + weapon.getNumberOfDamageDice() + "d" + weapon.getDamageDiceSize() + ")";
    } else {
      damageDiceString = "(" + weapon.getNumberOfDamageDice() + "d" + weapon.getDamageDiceSize() + " + " + relevantModifier + ")";
    }

    String targetsString;
    if(weapon.getTargets() == 1){
      targetsString = "one target.";
    } else {
      targetsString = weapon.getTargets() + " targets.";
    }

    return "<b>" + weapon.getName() + ".</b> "
        + "<i>" + weapon.getTypeOfAttack().getTypeOfAttack() + ":</i> "
        + toHitString
        + reachAndRangeString
        + targetsString
        + " <i>Hit:</i> " + averageDamage + " " + damageDiceString + " "
        + weapon.getDamageType().getDamageType() + " damage.";
  }

}
