package abst;

import java.util.Objects;

public class Fish extends Animal{

    public Fish(String type, double weight, String size) {
        super(type, weight, size);
    }

    @Override
    public void move() {

    }

    @Override
    public void makeNoise() {
        if (Objects.equals(type, "GoldFish")){
            System.out.println("Phew Fishy Fish!!!");
        } else {
            System.out.println("Mi Mi Mi");
        }
    }
}
