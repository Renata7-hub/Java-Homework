package BasketballGames;

import java.util.ArrayList;

class GamesRegister {



//   6- Past and Future games (EASY): In `GamesRegister`, add two functions:
//  Game[] getPastGames()` - returns past games   `Game[] getFutureGames()` - returns future games

// 7- Games Today (EASY):   In `GamesRegister` add a function
//`Game[] getTodayGames()` to get games of today

// 8- Games this week (MEDIUM): In `GamesRegister` add a function
//`Game[] getGamesOfThisWeek()` to get games of this week.

//### 9- Games at datetime (MEDIUM) In `GamesRegister` add a function
//`Game[] getGamesAtDateTime(DateTime dateTime)` to get games at that dateTime.
//    If DateTime only includes year and month, you should return all games that month,
//    If DateTime includes day, return games at that day,
//    If DateTime includes daytime, returns games at the exact time.

    // 5- New games (EASY):`GamesRegister` Has all the known games stored. You can add games to it
    // `void addGame(Game game)` and return all games added `Game[] getGames()`
    private ArrayList <Game> games;

    public GamesRegister(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<Game> getGames() {
        return games;
    }



}
