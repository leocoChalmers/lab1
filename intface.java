import java.awt.*;

interface intface
{
    int nrDoors = 0; // Number of doors on the car
    double enginePower = 0.0; // Engine power of the car
    double currentSpeed = 0.0; // The current speed of the car
    Color color = null; // Color of the car
    String modelName = ""; // The car model name

    int getNrDoors();
    double getEnginePower();


    double getCurrentSpeed();

    Color getColor();

    void setColor(Color clr);

    void startEngine();

    void stopEngine();

    double speedFactor();

    void gas(double amount);

    void brake(double amount);
}
