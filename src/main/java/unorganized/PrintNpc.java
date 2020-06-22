package unorganized;

import utilities.Utilities;
import weapons.PrintWeapon;
import weapons.Weapon;
import weapons.simple.Club;

public class PrintNpc {
  public static String printNpcDescription(NPC npc){

    String npcNameString = npc.getName(); // Commoner
    String npcRaceAndAlignmentString = capOnlyFirstLetter(npc.getSize().toString())
        + npc.getCreatureType()
        + " (" + npc.getRace() + "), "
        + npc.getAlignment(); //Medium humanoid (any race), any alignment
    String armorClassString = "Armor Class " + npc.getArmorClass(); // Armor Class 10
    String hitPointsString = "Hit Points "
        + npc.getAverageHp()
        + " ("
        + npc.getCrOrLevel()
        + "d"
        + npc.getHd()
        + ")"; // Hit Points 4 (1d8)
    String speedString = "Speed " + npc.getWalkingSpeed() + " ft."; // Speed 30 ft.
    String abilityModifiersString =
        printAbilityString("STR", npc.getStrength(), npc.getStrengthMod()) + " "
        + printAbilityString("DEX", npc.getDexterity(), npc.getDexterityMod()) + " "
        + printAbilityString("CON", npc.getConstitution(), npc.getConstitutionMod()) + " "
        + printAbilityString("INT", npc.getIntelligence(), npc.getIntelligenceMod()) + " "
        + printAbilityString("WIS", npc.getWisdom(), npc.getWisdomMod()) + " "
        + printAbilityString("CHA", npc.getCharisma(), npc.getCharismaMod());
        // STR 10 (+0) DEX 10 (+0) CON 10 (+0) INT 10 (+0) WIS 10 (+0) CHA 10 (+0)
    String sensesString = "Senses Passive Perception " + Utilities.calculatePassivePerception(AdvantageModifier.NONE, npc.getWisdomMod()); // Senses Passive Perception 10
    String languagesString = "Languages Any one language (usually " + npc.getLanguages() + ")"; // Languages Any one language (usually Common)
    String crString = "Challenge " + npc.getCrOrLevel(); // Challenge 0 (10 XP)
    String actionsString = "Actions";

    Weapon club = new Club();
    int toHit = Utilities.calculateToHit(npc.getStrengthMod());
    String weaponString = PrintWeapon.printWeaponDescription(club, toHit, npc.getStrengthMod()); // Club. Melee Weapon Attack: +2 to hit, reach 5 ft., one target. Hit: 2 (1d4) bludgeoning damage.


    return npcNameString + "\n"
        + npcRaceAndAlignmentString + "\n"
        + armorClassString + "\n"
        + hitPointsString + "\n"
        + speedString + "\n"
        + abilityModifiersString + "\n"
        + sensesString + "\n"
        + languagesString + "\n"
        + crString + "\n"
        + actionsString + "\n"
        + weaponString + "\n";
  }

  public static String printAbilityString(String ability, int abilityScore, int abilityModifier){
    String output = ability + " " + abilityScore + " (";
    if(abilityModifier < 0){
      output += abilityModifier;
    } else {
      output = output + "+" + abilityModifier;
    }
    output += ")";
    return output;
  }

  public static String capOnlyFirstLetter(String input){
    return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
  }
}
