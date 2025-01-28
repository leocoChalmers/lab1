import java.awt.*;

public abstract class Car implements intface, Movable {
    final int nrDoors = 0; // Number of doors on the car
    double enginePower = 0.0; // Engine power of the car
    double currentSpeed = 0.0; // The current speed of the car
    Color color = null; // Color of the car
    String modelName = "";

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

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }
}
