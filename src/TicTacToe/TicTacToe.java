package TicTacToe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TicTacToe {

//   private Board board;
    private List<Player> players = new ArrayList<>();

    public Board getBoard() {
        return new Board(new Values[3][3]);
    }



    public List<Player> getPlayers() {
        return this.players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
