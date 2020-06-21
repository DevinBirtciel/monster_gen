package weapons.simple;

import utilities.Utilities;
import weapons.DamageType;
import weapons.TypeOfAttack;

public class Club implements SimpleMeleeWeapon {

    private String name = "Club";
    private TypeOfAttack typeOfAttack = TypeOfAttack.MELEE_WEAPON_ATTACK;
    private int reach = 5;
    private int lowerRange = 20;
    private int upperRange = 60;
    private int targets = 1;
    private int numberOfDamageDice = 1;
    private int damageDiceSize = 4;
    private DamageType damageType = DamageType.BLUDGEONING;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public TypeOfAttack getTypeOfAttack() {
        return typeOfAttack;
    }

    @Override
    public void setTypeOfAttack(TypeOfAttack typeOfAttack) {
        this.typeOfAttack = typeOfAttack;
    }

    @Override
    public int getReach() {
        return reach;
    }

    @Override
    public void setReach(int reach) {
        this.reach = reach;
    }

    @Override
    public int getLowerRange() {
        return lowerRange;
    }

    @Override
    public void setLowerRange(int range) {
        lowerRange = range;
    }

    @Override
    public int getUpperRange() {
        return upperRange;
    }

    @Override
    public void setUpperRange(int range) {
        this.upperRange = range;
    }

    @Override
    public int getTargets() {
        return targets;
    }

    @Override
    public void setTargets(int targets) {
        this.targets = targets;
    }

    @Override
    public int getNumberOfDamageDice() {
        return numberOfDamageDice;
    }

    @Override
    public void setNumberOfDamageDice(int numberOfDamageDice) {
        this.numberOfDamageDice = numberOfDamageDice;
    }

    @Override
    public int getDamageDiceSize() {
        return damageDiceSize;
    }

    @Override
    public void setDamageDiceSize(int damageDiceSize) {
        this.damageDiceSize = damageDiceSize;
    }

    @Override
    public DamageType getDamageType() {
        return damageType;
    }

    @Override
    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }
}