package Turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;

    Pen pen = new Pen();
    SketchPad sketchPad = new SketchPad();
    @BeforeEach
    void setUp() {
        turtle = new Turtle(pen);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turtleHasAPen(){
//        turtle.setPen(pen);
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtlePenCanBeSetToDown(){
//        turtle.setPen(pen);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(PenOrientation.PEN_DOWN, turtle.getPen().getPenOrientation());
    }

    @Test
    void turtle_Pen_Can_be_up(){
//        turtle.setPen(pen);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(PenOrientation.PEN_UP, turtle.getPen().getPenOrientation());
    }

    @Test
    void turtleCanTurnRight(){
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeft(){
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    void sketchPadObjectIsNotNull(){
        assertNotNull(sketchPad);
    }

    @Test
    void sketchPadIsOfSize20(){
        assertEquals(20, sketchPad.floor.length);
    }
    @Test
    void turtleCanGetASketchPadWhenAboutToMove(){
        turtle.move(sketchPad, 0);
    }

    @Test
    void turtleCanTurnRightOnASketchPad(){
        turtle.setCurrentDirection(Direction.EAST);
//        SketchPad sketchPad = new SketchPad();
        turtle.move(sketchPad, 1);
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void whenMovesOnSketchPadItsPositionChanges(){
        turtle.setCurrentDirection(Direction.EAST);
        turtle.move(sketchPad, 5);
        assertEquals(4, turtle.getYCoordinate());
//        turtle.move(sketchPad, 1);
//        assertEquals(2, turtle.getYCoordinate());
    }

    @Test
    void whenTurtleMovesWithPenDownItWritesOnSKetchPad(){
        turtle.setCurrentDirection(Direction.NORTH);
        turtle.move(sketchPad, 3);
//        assertEquals(1, sketchPad.getFloor()[0][2]);
//        assertEquals(1, sketchPad.getFloor()[0][1]);

        System.out.println(turtle.getCurrentDirection());

        for(int i = 0; i < 3; i++){

                System.out.println(sketchPad.getFloor()[0][i]);
                    }
    }

    @Test
    void testThatTurtleDraws(){
        int steps = 7;
        pen.setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentDirection(Direction.NORTH);
        turtle.move(sketchPad, steps);
        for(int i = 0; i < steps; i++){
            assertEquals(1, sketchPad.getFloor()[0][i]);
        }

    }



}