package TicTacToe;

public class Board {
    private BoardValues[][] boardFloor;

    public Board(BoardValues[][] board){
        setBoard(board);
        this.boardFloor = board;
    }

    private void setBoard( BoardValues[][] board){
        for(int row = 0; row <=2; row++){
            for(int column = 0; column<=2; column++){
                board[row][column] = BoardValues.EMPTY;
            }
        }
    }

    public BoardValues[][] getBoardFloor(){
        return this.boardFloor;
    }
}
