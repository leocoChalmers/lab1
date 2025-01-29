import java.awt.*;

public class Volvo240 extends Car
{
    final static double trimFactor = 1.25;

    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    public void gas(double amount){
        if(amount <= 1 && amount>0){
            incrementSpeed(amount);
        }
    }

    public void brake(double amount){
        if (amount <= 1 && amount >0)
            decrementSpeed(amount);
    }
}
