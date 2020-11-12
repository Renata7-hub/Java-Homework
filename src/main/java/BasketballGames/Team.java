package BasketballGames;

//3- Team (EASY): Team has members (at least 5) and a coach. It also has a name.
public class Team {

    private int[] Player;
    private String teamName;
    private Coach team;

    public Team(int[] player, String teamName, Coach team) {
        Player = player;
        this.teamName = teamName;
        this.team = team;
    }

    public int[] getPlayer() {
        return Player;
    }

    public void setPlayer(int[] player) {
        Player = player;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Coach getTeam() {
        return team;
    }

    public void setTeam(Coach team) {
        this.team = team;
    }
}
