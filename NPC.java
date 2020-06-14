public abstract class NPC {
    public int strength, intelligence, charisma, dexerity, wisdom, constitution = 10;
    public int strengthMod = (int)((strength - 10) / 2);
    public int intelligenceMod = (int)((intelligence - 10) / 2);
    public int charismaMod = (int)((charisma - 10) / 2);
    public int dexerityMod = (int)((dexerity - 10) / 2);
    public int wisdomMod = (int)((wisdom - 10) / 2);
    public int constitutionMod = (int)((constitution - 10) / 2);
    public int level = 1;
    public int hd = 8;

    public int calculateAverageHp(){
        return (int)(((hd * level) + level + (constitutionMod * level)) / 2);
    }

    public int calculatePassivePerception(AdvantageModifier advantageModifier){
        int base = 10 + wisdomMod;
        if(advantageModifier == AdvantageModifier.ADVANTAGE){
            base += 5;
        } else if(advantageModifier == AdvantageModifier.DISADVANTAGE){
            base -= 5;
        } 
        return base;
    }
}