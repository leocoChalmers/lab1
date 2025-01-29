import java.awt.*;

    abstract class Car implements Movable {
    protected int nrDoors = 0; // Number of doors on the car
    protected double enginePower = 0.0; // Engine power of the car
    protected double currentSpeed = 0.0; // The current speed of the car
    protected Color color = null; // Color of the car
    protected double[] position = {0,0}; //X, Y positioning
    protected int direction = 0; //0 = North, 1 = East, 2 = South, 3 = West
    protected String modelName;

    private int changeDirection(int dir, int i){
        return (4 + dir + i) % 4;
    }
    public void move(){
        switch (direction){
            case 0:
                position[1] += currentSpeed;
                break;
            case 1:
                position[0] += currentSpeed;
                break;
            case 2:
                position[1] -= currentSpeed;
                break;
            case 3:
                position[0] -= currentSpeed;
                break;
        }
    }
    public void turnLeft(){
        direction = changeDirection(direction, -1);
    }
    public void turnRight(){
        direction = changeDirection(direction, 1);
    }

    public double[] getPosition(){
        return position;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){color = clr;}

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }
}
