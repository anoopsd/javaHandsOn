package challenge3;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new UtilityLine("College St", UilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Third st", UilityType.WATER));
        for (Mappable mappable : mappables) {
            Mappable.maoIt(mappable);
        }
    }
}

