package classes.birds;

import abstract_classes.Bird;
import interfaces.Flyable;
import interfaces.Walkable;

public class Crow extends Bird implements Walkable, Flyable {
    public Crow(int size) {
        super(size);
    }
}
