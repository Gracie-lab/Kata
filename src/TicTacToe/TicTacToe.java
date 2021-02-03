package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    Values[][] boardFloor = new Values[3][3];
    private Player currentPlayer;
   private Board board = new Board(boardFloor);
    private List<Player> players = new ArrayList<>();


    public Board getBoard() {
        return board;
    }



    public List<Player> getPlayers() {
        return this.players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }

}
