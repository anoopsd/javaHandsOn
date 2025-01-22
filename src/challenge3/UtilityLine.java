package challenge3;

enum UilityType { ELECTRICAL, FIBER_OPTIC, GAS, WATER}
public class UtilityLine implements Mappable{

    private String name;
    private UilityType type;

    public UtilityLine(String name, UilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name +" (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.GREEN + " " + LineMarker.SOLID;
            case FIBER_OPTIC -> Color.RED + " " + LineMarker.DASHED;
            case GAS -> Color.BLUE + " " + LineMarker.DOTTED;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s" , "type": "%s"
                """.formatted(name, type);
    }
}
