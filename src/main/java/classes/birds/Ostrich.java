package classes.birds;

import abstract_classes.Bird;
import interfaces.Walkable;

public class Ostrich extends Bird implements Walkable {
    public Ostrich(int size) {
        super(size);
    }
}
