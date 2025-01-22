package challenge3;

enum UsageType { ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}
public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.CIRCLE;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.PUSH_PIN;
            case SPORTS -> Color.BLUE + " " + PointMarker.CIRCLE;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s" , "usage": "%s"
                """.formatted(name, usage);
    }
}
