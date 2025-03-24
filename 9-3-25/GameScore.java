public class GameScore {
    public void updateScore(String player, int score) {
        System.out.println("Player " + player + " scored " + score);
    }

    public void updateScore(String team, int score, boolean isTeamGame) {
        if (isTeamGame) {
            System.out.println("Team " + team + " scored " + score);
        }
    }
}
