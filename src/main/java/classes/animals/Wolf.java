package classes.animals;

import abstract_classes.Animal;
import interfaces.Walkable;

public class Wolf extends Animal implements Walkable {
    public Wolf(int size) {
        super(size);
    }
}
