package nestedclass;

public class Outer {
    private String name = "Outer";

    class Inner {
        void print() {
            System.out.println("Printed name from Outer class" + name);
        }
    }
}
