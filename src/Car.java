public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void describeCar() {
        System.out.println("Make : " + make +
                color + " " +
                doors + "-Doors" +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
