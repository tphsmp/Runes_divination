package divination;

        import java.util.*;

public class Runner {
    public static void main(String[] args) {

        RunesMaker makeRunes = new RunesMaker();

        RunesList rList = new RunesList();

        makeRunes.makeRunesList(rList);

        rList.mixRunes(1);

        rList.generateRunes(0, 2);

    }

}
