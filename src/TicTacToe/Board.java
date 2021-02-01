package TicTacToe;

public class Board {
    private Values[][] boardFloor;

    public Board(Values[][] board){
        setBoard(board);
        this.boardFloor = board;
    }

    private void setBoard( Values[][] board){
        for(int row = 0; row <=2; row++){
            for(int column = 0; column<=2; column++){
                board[row][column] = Values.EMPTY;
            }
        }
    }

    public Values[][] getBoardFloor(){
        return this.boardFloor;
    }
}
