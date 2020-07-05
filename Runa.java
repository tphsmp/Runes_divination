package divination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runa {

    //задаем свойства рунного камня
    private String name;
    private String description;
    private int orderNumber;
    private int positionsPossible;

    public Runa(String name, String description, int orderNumber, int positionsPossible) {
        this.name = name;
        this.description = description;
        this.orderNumber = orderNumber;
        this.positionsPossible = positionsPossible;
    }

    public Runa() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getPositionsPossible() {
        return this.positionsPossible;
    }

    @Override
    public String toString() {
        return name;
    }
}

