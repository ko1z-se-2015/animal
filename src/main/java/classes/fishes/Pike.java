package classes.fishes;

import abstract_classes.Fish;
import interfaces.Swimable;

public class Pike extends Fish implements Swimable {
    public Pike(int size) {
        super(size);
    }
}
