public class Utils {

    public static int calculateAverageHp(int hd, int level, int constitutionModifier){
        return (int)(((hd * level) + level + (constitutionModifier * level)) / 2);
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

    public static int determineProficiencyBonus(int level){
        if(level < 5){
            return 2;
        } else if (level < 9){
            return 3;
        } else if (level < 13){
            return 4;
        } else if (level < 17){
            return 5;
        } else {
            return 6;
        }
    }
    
}