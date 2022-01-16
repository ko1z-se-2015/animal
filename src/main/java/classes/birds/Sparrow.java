package classes.birds;

import abstract_classes.Bird;
import interfaces.Flyable;
import interfaces.Walkable;

public class Sparrow extends Bird implements Walkable, Flyable {
    public Sparrow(int size) {
        super(size);
    }
}
