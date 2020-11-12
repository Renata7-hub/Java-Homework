package BasketballGames;

import java.time.LocalDateTime;

public class Game {
    // 4- Game has 2 teams, a score and a datetime. It also has a function Team getWinner() to return the winner team.
    private Team teamFirst;
    private Team TeamSecond;
    private int scoreFirstTeam;
    private int scoreSecondTeam;
    private LocalDateTime gameDateTime;
    private String getWinner;

    public Game(Team teamFirst, Team teamSecond, int scoreFirstTeam, int scoreSecondTeam,
                LocalDateTime gameDateTime, String getWinner) {
        this.teamFirst = teamFirst;
        TeamSecond = teamSecond;
        this.scoreFirstTeam = scoreFirstTeam;
        this.scoreSecondTeam = scoreSecondTeam;
        this.gameDateTime = gameDateTime;
        this.getWinner = getWinner;
    }


    public String getWinner (Team teamFirst, Team teamSecond, int scoreFirstTeam, int scoreSecondTeam)  {
        if (scoreFirstTeam > scoreSecondTeam)  {
            return "winner is "+ teamFirst;
        } else if (scoreSecondTeam > scoreFirstTeam) {
            return "winner is " + teamSecond;
        } else {
            return "Match was canceled";}
    }

    public Team getTeamFirst() {
        return teamFirst;
    }

    public Team getTeamSecond() {
        return TeamSecond;
    }

    public int getScoreFirstTeam() {
        return scoreFirstTeam;
    }

    public int getScoreSecondTeam() {
        return scoreSecondTeam;
    }

    public LocalDateTime getGameDateTime() {
        return gameDateTime;
    }
}
