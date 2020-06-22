package unorganized;

public class Generator {

  public static NPC generate(Race race){
    NPC npc = null;
    if(Race.HUMAN == race){
      npc = new HumanBase();
    }


    return npc;
  }

}
