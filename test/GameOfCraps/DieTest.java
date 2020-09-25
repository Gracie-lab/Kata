package GameOfCraps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    Die die;
    Player player;

    @BeforeEach
    void setUp() {
        die = new Die();
        player = new Player();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dieHas6SidesTest(){
        Die die1 = new Die(6);
    }

    @Test
    void playerHasTwoDiceTest(){
//        player.getDie1();
//        player.getDie2();
    }

    @Test
    void playerCanRollDiceTest(){

//        System.out.println(player.rollDice());
        System.out.println(player.play());
    }

    @Test
    void playerCanPlayAgain(){
        System.out.println(player.play());
    }

    @Test
    void playerCanWager(){
        System.out.println(player.wager(800));
    }

    @Test
    void playGameMultipleTimeAndShowNumberOfGamesWonAndLost(){
        System.out.println(player.play1000games());
    }





}