package classes.fishes;

import abstract_classes.Fish;
import interfaces.Swimable;
import interfaces.Walkable;

public class Pike extends Fish implements Swimable {
    public Pike(int size) {
        super(size);
    }
    public  boolean Walk(){
        return Swimable.walk;
    }
    public  boolean Fly(){
        return Swimable.fly;
    }
    public  boolean Swim(){
        return Swimable.swim;
    }
}
