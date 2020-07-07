package divination;

        import java.util.*;

public class Runner {
    public static void main(String[] args) {

        RunesList rList = new RunesList();

        rList.makeRunes(rList);

        rList.mixRunes(3);

        rList.generateRunes(0, 2);

    }

}
