package TicTacToe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    Board board;

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
}