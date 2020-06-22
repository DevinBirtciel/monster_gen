package unorganized;

import java.util.ArrayList;
import java.util.List;
import utilities.Utilities;

public abstract class NPC {
    private int strength = 10;
    private int intelligence = 10;
    private int charisma = 10;
    private int dexterity = 10;
    private int wisdom = 10;
    private int constitution = 10;
    private int strengthMod = (strength - 10) / 2;
    private int intelligenceMod = (intelligence - 10) / 2;
    private int charismaMod = (charisma - 10) / 2;
    private int dexterityMod = (dexterity - 10) / 2;
    private int wisdomMod = (wisdom - 10) / 2;
    private int constitutionMod = (constitution - 10) / 2;
    private int crOrLevel = 1;
    private int hd = 8;
    private Race race = Race.ANY_RACE;
    private String name = "Default Name";
    private Size size = Size.MEDIUM;
    private int walkingSpeed = 30;
    private int averageHp = Utilities.calculateAverageHp(hd, crOrLevel, constitutionMod);
    private int armorClass = 10;
    private List<String> languages = new ArrayList<String>();
    private CreatureType creatureType = CreatureType.HUMANOID;
    private Alignment alignment = Alignment.ANY_ALIGNMENT;

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getCharisma() {
    return charisma;
  }

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  public int getDexterity() {
    return dexterity;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public int getWisdom() {
    return wisdom;
  }

  public void setWisdom(int wisdom) {
    this.wisdom = wisdom;
  }

  public int getConstitution() {
    return constitution;
  }

  public void setConstitution(int constitution) {
    this.constitution = constitution;
  }

  public int getStrengthMod() {
    return strengthMod;
  }

  public void setStrengthMod(int strengthMod) {
    this.strengthMod = strengthMod;
  }

  public int getIntelligenceMod() {
    return intelligenceMod;
  }

  public void setIntelligenceMod(int intelligenceMod) {
    this.intelligenceMod = intelligenceMod;
  }

  public int getCharismaMod() {
    return charismaMod;
  }

  public void setCharismaMod(int charismaMod) {
    this.charismaMod = charismaMod;
  }

  public int getDexterityMod() {
    return dexterityMod;
  }

  public void setDexterityMod(int dexterityMod) {
    this.dexterityMod = dexterityMod;
  }

  public int getWisdomMod() {
    return wisdomMod;
  }

  public void setWisdomMod(int wisdomMod) {
    this.wisdomMod = wisdomMod;
  }

  public int getConstitutionMod() {
    return constitutionMod;
  }

  public void setConstitutionMod(int constitutionMod) {
    this.constitutionMod = constitutionMod;
  }

  public int getCrOrLevel() {
    return crOrLevel;
  }

  public void setCrOrLevel(int crOrLevel) {
    this.crOrLevel = crOrLevel;
  }

  public int getHd() {
    return hd;
  }

  public void setHd(int hd) {
    this.hd = hd;
  }

  public Race getRace() {
    return race;
  }

  public void setRace(Race race) {
    this.race = race;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  public int getWalkingSpeed() {
    return walkingSpeed;
  }

  public void setWalkingSpeed(int walkingSpeed) {
    this.walkingSpeed = walkingSpeed;
  }

  public int getAverageHp() {
    return averageHp;
  }

  public void setAverageHp(int averageHp) {
    this.averageHp = averageHp;
  }

  public int getArmorClass() {
    return armorClass;
  }

  public void setArmorClass(int armorClass) {
    this.armorClass = armorClass;
  }

  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public CreatureType getCreatureType() {
    return creatureType;
  }

  public void setCreatureType(CreatureType creatureType) {
    this.creatureType = creatureType;
  }

  public Alignment getAlignment() {
    return alignment;
  }

  public void setAlignment(Alignment alignment) {
    this.alignment = alignment;
  }
}