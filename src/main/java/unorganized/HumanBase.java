package unorganized;

import java.util.List;
import utilities.Utilities;

public class HumanBase extends NPC {

    public HumanBase() {
        List<String> languages = getLanguages();
        languages.add("common");
        setLanguages(languages);

        setRace(Race.HUMAN);
        setSize(Size.MEDIUM);
        setArmorClass(10);
        setHd(8);
        int averageHp = Utilities.calculateAverageHp(getHd(), getCrOrLevel(), getConstitutionMod());
        setAverageHp(averageHp);
        setWalkingSpeed(30);
    }

}