package divination;

public class RunesMaker extends RunesList{

    public void makeRunesList(RunesList runesList) {

        //создаем набор для гадания на основе Старшего Футарка

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
