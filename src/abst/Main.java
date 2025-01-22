package abst;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Husky", 32, "medium"));
        animals.add(new Dog("Pug", 24, "small"));
        animals.add(new Fish("GoldFish", 3, "small"));
        animals.add(new Fish("Tuna", 6, "medium"));

        for (Animal animal: animals) {
            doAnimalStuff(animal);
        }
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
    }
}
