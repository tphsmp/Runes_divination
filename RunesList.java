package divination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunesList extends Runa {

    List<Runa> runesList = new ArrayList<Runa>();

    public int getSize() {
        return runesList.size();
    }

    //добавляем камень в лист
    public void addRunes(Runa runa) {
        runesList.add(runa);
    }

    ////Перемешиваем руны, число аналогично количеству встряхиваний камней
    public void mixRunes(int z) {
        while (z != 0) {
            Collections.shuffle(runesList);
            z--;
        }
        System.out.println("May the runes say truth \n");
    }

    /*указываем количество рун, которые нужно достать для гадания, 0 соотвествует 1,
        если нужно вытащить тру руны надо указать 0 и 2 */
    public void generateRunes(int x, int y) {
        for (int i = x; i <= y; i++) {
            String str = " ";
            int position = (int) (1 + Math.random() * 2);
            if ((position != 1 || runesList.get(i).getPositionsPossible() != 1) &&
                    (position == 1 || runesList.get(i).getPositionsPossible() != 1) &&
                    (position != 1 || runesList.get(i).getPositionsPossible() != 2)) {
            } else {
                str = "";
            }
            if (position != 1 && runesList.get(i).getPositionsPossible() == 2) {
                str = "↓";
            }
            System.out.println(i + 1 + " " + str + " " + runesList.get(i));
        }
    }
    
    public void makeRunes(RunesList runesList) {
        runesList.addRunes(new Runa("FEHU", "", 1, 2));
        runesList.addRunes(new Runa("URUZ", "", 2, 2));
        runesList.addRunes(new Runa("THURISAZ", "", 3, 2));
        runesList.addRunes(new Runa("ANSUZ", "", 4, 2));
        runesList.addRunes(new Runa("RAIDO", "", 5, 2));
        runesList.addRunes(new Runa("KENAZ", "", 6, 2));
        runesList.addRunes(new Runa("GIFU", "", 7, 1));
        runesList.addRunes(new Runa("WUNJO", "", 8, 2));
        runesList.addRunes(new Runa("HAGALAZ", "", 9, 1));
        runesList.addRunes(new Runa("NAUTIZ", "", 10, 1));
        runesList.addRunes(new Runa("ISA", "", 11, 1));
        runesList.addRunes(new Runa("JERA", "", 12, 1));
        runesList.addRunes(new Runa("EIHWAZ", "", 13, 1));
        runesList.addRunes(new Runa("PERTHRO", "", 14, 2));
        runesList.addRunes(new Runa("ALGIZ", "", 15, 2));
        runesList.addRunes(new Runa("SIEGEL", "", 16, 1));
        runesList.addRunes(new Runa("TYR", "", 17, 2));
        runesList.addRunes(new Runa("BERKANA", "", 18, 2));
        runesList.addRunes(new Runa("EHWAZ", "", 19, 2));
        runesList.addRunes(new Runa("MANNAZ", "", 20, 2));
        runesList.addRunes(new Runa("LAGUZ", "", 21, 2));
        runesList.addRunes(new Runa("INGWAZ", "", 22, 1));
        runesList.addRunes(new Runa("DAGAZ", "", 23, 1));
        runesList.addRunes(new Runa("OTHAL", "", 24, 2));
        runesList.addRunes(new Runa("WYRD", "", 25, 1));
    }

}
