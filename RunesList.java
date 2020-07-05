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

}
