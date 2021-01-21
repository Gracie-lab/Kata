package Turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;

    Pen pen = new Pen();
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
    void turtleCanMoveEastWardOnASketchPad(){
        turtle.setCurrentDirection(Direction.EAST);
        SketchPad sketchPad = new SketchPad();
        turtle.move(sketchPad, 5);

    }


}