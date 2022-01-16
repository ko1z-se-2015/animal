package classes.birds;

import abstract_classes.Bird;
import interfaces.Swimable;
import interfaces.Walkable;

public class Penguin extends Bird implements Walkable, Swimable {
    public Penguin(int size) {
        super(size);
    }
}
