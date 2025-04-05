package nestedclass;

/*
Nested Class
│
├── Static Nested Class
│
└── Inner Class
    ├── Member Inner Class
    ├── Local Inner Class
    └── Anonymous Inner Class
 */
public class Main {
    public static void main(String[] args) {
        Home.Location loc = new Home.Location();
        loc.printLocationWithName();

        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.print();
    }
}
