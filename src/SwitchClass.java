public class SwitchClass {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(getNUmber(78));
    }

    public static int getNUmber(int number) {
        return switch (number) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            default -> {
                int response = 1000;
                yield response;
            }
        };
    }
}
