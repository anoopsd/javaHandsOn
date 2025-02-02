package challenge3;
enum Geometry { LINE, POINT, POLYGON }
enum Color { RED, GREEN, BLUE, BLACK }
enum PointMarker { CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE }
enum LineMarker{ DASHED, DOTTED, SOLID }
public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}
            """;
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJson() {
        return """
                "type": "%s" , "label": "%s" , "marker": "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }
    static void maoIt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJson());
    }
}
