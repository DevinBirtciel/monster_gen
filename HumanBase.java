import java.util.ArrayList;
import java.util.List;

public class HumanBase extends NPC implements Humanoid, ANY_ALIGNMENT {
    public int walkingSpeed = 30;
    public int hd = 8;
    public int averageHp = Utilities.calculateAverageHp(hd, crOrLevel, constitutionMod);
    public int armorClass = 10;
    public Size size = Size.MEDIUM;
    public List<String> languages = new ArrayList<String>();

    public HumanBase() {
        languages.add("common");
    }  
}