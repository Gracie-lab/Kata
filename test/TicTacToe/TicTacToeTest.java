package TicTacToe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    Board board;
    Random generateRandomNumber = new Random();

    Values[][] floor = new Values[3][3];
    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
        board = new Board(floor);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTicTacToeObjectIsNotNull(){
        assertNotNull(ticTacToe);
    }

    @Test
    void ticTacToeHasABoard(){
        assertNotNull(ticTacToe.getBoard());
    }

    @Test
    void testThatBoardFloorIsEmptyByDefault(){
        for(int row = 2; row <=2; row++){
            for(int column = 2; column<=2; column++){
                assertEquals(Values.EMPTY, ticTacToe.getBoard().getBoardFloor()[row][column]);
            }
        }
    }

    @Test
    void testThatPlayersCanBeAddedToGame(){
        Player player = new Player();
        ticTacToe.addPlayer(player);
        assertNotNull(ticTacToe.getPlayers());
    }

    @Test
    void test_tictactoe_has_two_players(){
        ticTacToe.addPlayer(new Player());
        ticTacToe.addPlayer(new Player());
        assertEquals(2, ticTacToe.getPlayers().size());
    }

    @Test
    void gameCanSetPlayersTurnToPlay(){
        ticTacToe.setCurrentPlayer(new Player());
        Player player = ticTacToe.getCurrentPlayer();
        assertNotNull(player);
    }

    @Test
    void playersCurrentPositionCanBeTracked(){
        ticTacToe.setCurrentPlayer(new Player());
        ticTacToe.getCurrentPlayer().setxCoordinate(1);
        ticTacToe.getCurrentPlayer().setyCoordinate(0);
        assertEquals(1,ticTacToe.getCurrentPlayer().getxCoordinate());
        assertEquals(0, ticTacToe.getCurrentPlayer().getyCoordinate());
    }


    @Test
    void testThatPlayerCanMove(){
        ticTacToe.setCurrentPlayer(new Player());
        ticTacToe.getCurrentPlayer().setxCoordinate(0);
        ticTacToe.getCurrentPlayer().setyCoordinate(1);
        ticTacToe.getCurrentPlayer().move(0, 1);
        assertEquals(0, ticTacToe.getCurrentPlayer().getxCoordinate());
        assertEquals(2, ticTacToe.getCurrentPlayer().getyCoordinate());
    }

    @Test
    void playerMarksBoardWhenPlayerMoves(){
        Player x = new Player();
        ticTacToe.setCurrentPlayer(x);
        ticTacToe.getCurrentPlayer().move(1,2);
        ticTacToe.getCurrentPlayer().sketch(ticTacToe.getBoard(), Values.X);

        assertEquals(Values.X, ticTacToe.getBoard().getBoardFloor()
                                    [ticTacToe.getCurrentPlayer().getxCoordinate()]
                                        [ticTacToe.getCurrentPlayer().getyCoordinate()]);
    }

    @Test
    void playGame(){
        Player x = new Player();
        Player o = new Player();
        ticTacToe.getCurrentPlayer().playGame();
    }

    @Test
    void testThatICanSeeGame(){
        Player x = new Player();
        ticTacToe.setCurrentPlayer(x);
        ticTacToe.getCurrentPlayer().playGame();
//        ticTacToe.getCurrentPlayer().move(generateRandomNumber.nextInt(3),generateRandomNumber.nextInt(3));
//        ticTacToe.getCurrentPlayer().sketch(ticTacToe.getBoard(), Values.X);

        Player o = new Player();
        ticTacToe.setCurrentPlayer(o);
        ticTacToe.getCurrentPlayer().move(2,2);
        ticTacToe.getCurrentPlayer().sketch(ticTacToe.getBoard(), Values.O);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == ticTacToe.getCurrentPlayer().getxCoordinate() && j ==ticTacToe.getCurrentPlayer().getyCoordinate()){
                    System.out.print(ticTacToe.getBoard().getBoardFloor()[ticTacToe.getCurrentPlayer().getxCoordinate()]
                            [ticTacToe.getCurrentPlayer().getyCoordinate()] + " ");
                }
                else
                System.out.print(ticTacToe.getBoard().getBoardFloor()[i][j] + " ");
            }

            System.out.println();
        }

//        for(int row = 2; row <=2; row++){
//            for(int column = 2; column<=2; column++){
//                System.out.println(ticTacToe.getBoard().getBoardFloor()[row][column]);
//            }
//        }
//        ticTacToe.showGame();


    }

    @Test
    void twoPlayersPlayGame(){
        Player x = new Player();
        Player o = new Player();

        ticTacToe.setCurrentPlayer(x);
        ticTacToe.getCurrentPlayer().setxCoordinate(0);
        ticTacToe.getCurrentPlayer().setyCoordinate(0);
        ticTacToe.getCurrentPlayer().move(generateRandomNumber.nextInt(3), generateRandomNumber.nextInt(3));
        ticTacToe.getCurrentPlayer().sketch(ticTacToe.getBoard(), Values.X);


    }

    @Test
    void printTwoDimensionalArray(){
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

}