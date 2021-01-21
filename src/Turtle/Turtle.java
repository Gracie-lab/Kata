package Turtle;

public class Turtle {
//    private Direction direction;
    private Direction currentDirection;
    private Pen pen;

    public Turtle(Pen pen){
        this.pen = pen;
        this.currentDirection = Direction.EAST;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void turnRight() {
//        switch(currentDirection){
//            case EAST -> setCurrentDirection(Direction.SOUTH);
//        }
        if (currentDirection == Direction.EAST){
           this. currentDirection=Direction.SOUTH;
        }
        else if(currentDirection == Direction.SOUTH){
            this.currentDirection = Direction.WEST;
        }
        else if(currentDirection == Direction.WEST){
            this.currentDirection = Direction.NORTH;
        }
        else{
            this.currentDirection= Direction.EAST;
        }
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST){
            this. currentDirection=Direction.NORTH;
        }
        else if(currentDirection == Direction.NORTH){
            this.currentDirection = Direction.WEST;
        }
        else if(currentDirection == Direction.WEST){
            this.currentDirection = Direction.SOUTH;
        }
        else{
            this.currentDirection= Direction.EAST;
        }
    }

    public void move(SketchPad sketchPad, int numberOfMoves) {

    }
}
