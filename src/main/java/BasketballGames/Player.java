package BasketballGames;

public class Player {
// 1- Player is a human (EASY):Player is a human, but it also has number (player number), position, game stats:
//fouls-baudos, rebounds-atkovoti kamuoliai
//3-point score, 2-point scores
//3-point shots, 2-point shots
//2-point accuracy, 3-point accuracy

    private Human player;
    private int number;
    private String position;
    private gameStats gameStats;

    public static class gameStats{
        private int pointScore3;
        private int pointScore2;
        private int pointFoul;
        private int fouls;
        private int rebounds;
        private int shotsScore3;
        private int shotsScore2;
        private int shotsScoreFoul;
        private float accuracyScore3;
        private float accuracyScore2;
        private float accuracyFoul;
    }


    public Player(Human player, int number, String position, Player.gameStats gameStats) {
        this.player = player;
        this.number = number;
        this.position = position;
        this.gameStats = gameStats;
    }
    public float getAccuracyScore3(int pointScore3, int shotsScore3) {
        return pointScore3/shotsScore3;
    }

    public float getAccuracyScore2(int pointScore2, int shotsScore2) {
        return pointScore2/shotsScore2;
    }

    public float getAccuracyScoreFoul(int pointScoreFoul, int shotsScoreFoul) {
        return pointScoreFoul/shotsScoreFoul;
    }

    public int getNumber() {
        return number;
    }

     public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Player.gameStats getGameStats() {
        return gameStats;
    }

    public void setGameStats(Player.gameStats gameStats) {
        this.gameStats = gameStats;
    }

    public Human getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
               "player=" + player +
               ", number=" + number +
               ", position='" + position + '\'' +
               ", gameStats=" + gameStats +
               '}';
    }
}
