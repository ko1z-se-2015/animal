package classes.fishes;

import abstract_classes.Fish;
import interfaces.Swimable;

public class Shark extends Fish implements Swimable {
    public Shark(int size) {
        super(size);
    }
}
