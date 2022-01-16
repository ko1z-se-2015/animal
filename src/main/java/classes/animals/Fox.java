package classes.animals;

import abstract_classes.Animal;
import interfaces.Walkable;

public class Fox extends Animal implements Walkable {
    public Fox(int size) {
        super(size);
    }
}
