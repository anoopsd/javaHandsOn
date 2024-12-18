public class ExpressionsStatements {
    public static void main(String[] args) {

        int position = CalculateHighScorePosition(1500);
        displayHighScorePosition("Anoop", position);
        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int CalculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.609;
        return Math.round(milesPerHour);
    }
    public static  void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " Km/h = " + milesPerHour + " mi/h");
    }
}
