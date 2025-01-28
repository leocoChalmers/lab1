import java.awt.*;

interface intface
{
    int nrDoors = 0; // Number of doors on the car
    double enginePower = 0.0; // Engine power of the car
    double currentSpeed = 0.0; // The current speed of the car
    Color color = null; // Color of the car
    String modelName = ""; // The car model name

    public int getNrDoors();
    public double getEnginePower();


    public double getCurrentSpeed();

    public Color getColor();

    public void setColor(Color clr);

    public void startEngine();

    public void stopEngine();

    public double speedFactor();


    // TODO fix this method according to lab pm
    public void gas(double amount);

    // TODO fix this method according to lab pm
    public void brake(double amount);
}
