import java.awt.*;

public class Saab95 extends Car
{

    boolean turboOn;

    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    private void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public void gas(double amount){
        if(amount <= 1 && amount>0){
            incrementSpeed(amount);
            if(currentSpeed > enginePower)
                currentSpeed = enginePower;
        }
    }

    public void brake(double amount){
        if (amount < 1 && amount >0){
                decrementSpeed(amount);
                if (currentSpeed < 0)
                    currentSpeed = 0;
        }
    }
}
