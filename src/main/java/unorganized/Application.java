package unorganized;

import weapons.PrintWeapon;
import weapons.simple.Club;
import weapons.simple.Dagger;

public class Application {
  public static void main(String[] args) {
    Dagger dagger = new Dagger();
    Club club = new Club();
    System.out.println(PrintWeapon.printWeaponDescription(dagger, 2, 0));
    System.out.println(PrintWeapon.printWeaponDescription(club, 2, 0));
    NPC npc = new HumanBase();
    System.out.println(PrintNpc.printNpcDescription(npc));
  }
}
