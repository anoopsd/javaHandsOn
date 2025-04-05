package nestedclass;

public class Home {
    public static String houseName = "Deepam";

    static class Location {
      void printLocationWithName() {
          System.out.println("House " + houseName + " is located in planet Earth.");
      }
    }
}
