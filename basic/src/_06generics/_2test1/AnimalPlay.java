package src._06generics._2test1;

import java.util.List;

public class AnimalPlay {
    public void play(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.play();
        }
    }
}
