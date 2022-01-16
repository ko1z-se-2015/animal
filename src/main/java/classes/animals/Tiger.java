package classes.animals;

import abstract_classes.Animal;
import interfaces.Walkable;

public class Tiger extends Animal implements Walkable {
    public Tiger(int size) {
        super(size);
    }
}
