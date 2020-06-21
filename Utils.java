public class Utils {

    public static int calculateAverageHp(int hitDice, int crOrLevel, int constitutionModifier){
        return (int)(((hitDice * crOrLevel) + crOrLevel + (constitutionModifier * crOrLevel)) / 2);
    }

    public static int calculatePassivePerception(AdvantageModifier advantageModifier, int wisdomModifier){
        int base = 10 + wisdomModifier;
        if(advantageModifier == AdvantageModifier.ADVANTAGE){
            base += 5;
        } else if(advantageModifier == AdvantageModifier.DISADVANTAGE){
            base -= 5;
        } 
        return base;
    }

    public static int calculateProficiencyBonus(int crOrLevel){  
        int proficiencyBonus = (int) Math.ceil(crOrLevel/4) + 1;
        if(proficiencyBonus < 2){
            return 2;
        }
        return proficiencyBonus;
    }

    public static int calculateToHit(int relevantModifier) {
        return relevantModifier;
    }

    public static int calculateProficientToHit(int relevantModifier, int crOrLevel){
        return relevantModifier + calculateProficiencyBonus(crOrLevel);
    }

    public static int calculateAverageDamage(int numberOfDamageDice, int damageDiceSize, int relevantModifier){
        return (int) ((numberOfDamageDice + (numberOfDamageDice * damageDiceSize) + relevantModifier)/2);
    }
}