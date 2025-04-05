package generics;

record BaseballPlayer(String name, String position) {}
public class Main {
    public static void main(String[] args) {
        BaseballTeam team1 = new BaseballTeam("LA GALAXY");
        BaseballTeam team2 = new BaseballTeam("Inter MIAMI");
        scoreResult(team1, 5, team2, 9);
    }
    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}


