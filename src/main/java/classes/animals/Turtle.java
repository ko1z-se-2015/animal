package classes.animals;

import abstract_classes.Animal;
import interfaces.Swimable;
import interfaces.Walkable;

public class Turtle extends Animal implements Walkable, Swimable {
    public Turtle(int size) {
        super(size);
    }
}
