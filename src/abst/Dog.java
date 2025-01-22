package abst;

import java.util.Objects;

public class Dog extends Animal{

    public Dog(String type, double weight, String size) {
        super(type, weight, size);
    }

    @Override
    public void move() {

    }

    @Override
    public void makeNoise() {
    if (Objects.equals(type, "dog")){
        System.out.println("Bow Bow Bow");
    } else {
        System.out.println("Woof!");
    }
    }
}
