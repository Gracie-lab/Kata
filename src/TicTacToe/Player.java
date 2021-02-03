package TicTacToe;


import java.util.Random;

public class Player {
    private int xCoordinate;
    private int yCoordinate;
    Random generateRandomNumber = new Random();

    private  TicTacToe ticTacToe = new TicTacToe();

    public int getxCoordinate(){
        return xCoordinate;
    }

    public int getyCoordinate(){
        return yCoordinate;
    }

    public void setxCoordinate(int position) {
        this.xCoordinate = position;
    }

    public void setyCoordinate(int position) {
        this.yCoordinate = position;
    }

    public void move(int numberOfMovesToXDirection , int numberOfMovesToYDirection) {
        xCoordinate = xCoordinate + numberOfMovesToXDirection;
        yCoordinate = yCoordinate + numberOfMovesToYDirection;
    }

    public void sketch(Board board, Values value) {
        board.getBoardFloor()[xCoordinate][yCoordinate] = value;
    }

    public void playGame() {
        move(generateRandomNumber.nextInt(3), generateRandomNumber.nextInt(3));
        sketch(ticTacToe.getBoard(), Values.X);
    }


}
