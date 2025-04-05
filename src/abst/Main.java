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

        int[] arr = new int[10];
        arr[1] = 1;
        System.out.println(arr[2] += arr[2-1]);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
    }
}
