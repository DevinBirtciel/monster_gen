package weapons.simple;

import unorganized.Finesse;
import utilities.Utilities;

public class Dagger implements SimpleMeleeWeapon, Finesse {
  public String print(int toHit, int relevantModifier){
    int averageDamage = Utilities.calculateAverageDamage(1, 4, relevantModifier);
    return "<b>Dagger.</b> <i>Melee Weapon Attack:</i> +" + toHit +
        " to hit, reach 5 ft., one target. <i>Hit:</i> " + averageDamage +
        "(1d4) piercing damage.";
  }
}