package weapons;

public class Club implements SimpleMeleeWeapon {

    public String print(int toHit, int relevantModifier){
        int averageDamage = Utilities.calculateAverageDamage(1, 4, relevantModifier);
        return "<b>Club.</b> <i>Melee Weapon Attack:</i> +" + toHit + 
        " to hit, reach 5 ft., one target. <i>Hit:</i> " + averageDamage +
        "(1d4) bludgeoning damage.";
    }
}