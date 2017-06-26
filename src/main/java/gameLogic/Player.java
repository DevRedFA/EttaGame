package gameLogic;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Player implements Serializable, Comparable<Player> {

    private String name;
    private static int players_count = 0;
    private int player_id;
    private int age, max_points_per_game, max_points_per_round, all_games, win_games;
    private int points_in_current_game, max_points_in_current_game;

//    public Player(String name) {
//        this.name = name;
//        player_id = ++players_count;
//        points_in_current_game = 0;
//        max_points_in_current_game = 0;
//    }

    Player(String name, int age, int max_points_per_game, int max_points_per_round, int all_games, int win_game) {
        this.name = name;
        this.age = age;
        player_id = ++players_count;
        points_in_current_game = 0;
        max_points_in_current_game = 0;
        this.max_points_per_game = max_points_per_game;
        this.max_points_per_round = max_points_per_round;
        this.all_games = all_games;
        this.win_games = win_game;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

//    public void setStatistic(int age, int max_points_per_game, int max_points_per_round, int all_games, int win_game) {
//        this.age = age;
//        this.max_points_per_game = max_points_per_game;
//        this.max_points_per_round = max_points_per_round;
//        this.all_games = all_games;
//        this.win_games = win_game;
//    }

    void setRoundPoints(int points) {
        max_points_in_current_game = (max_points_in_current_game > points) ? max_points_in_current_game : points;
        points_in_current_game += points;
    }

    int getGamePoints() {
        return points_in_current_game;
    }

    int getRoundMaxPoints() {
        return max_points_in_current_game;
    }

    void endGame(boolean win) {
        if (win) {
            win_games++;
        }
        all_games++;
        max_points_per_game = (max_points_per_game > points_in_current_game) ? max_points_per_game : points_in_current_game;
        max_points_per_round = (max_points_per_round > max_points_in_current_game) ? max_points_per_round : max_points_in_current_game;
        points_in_current_game = 0;
        max_points_in_current_game = 0;
    }

    @Override
    public String toString() {
        return (name + " id: " + player_id + " age: " + age + " max_round_points: " + max_points_per_round + " max_game_points: " + max_points_per_game + " win rate: " + ((double) win_games / (double) all_games) + " by " + all_games + " games");
    }

    String toBase() {
        return ("" + name + "," + age + "," + max_points_per_round + "," + max_points_per_game + "," + all_games + "," + win_games);
    }

    @Override
    public int hashCode() {
        return player_id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        /* if (this.player_id != other.player_id) {
        return false;
        }*/
        return true;
    }

    public int compareTo(Player o) {
        return name.compareTo(o.getName());
    }
}
