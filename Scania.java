
import java.awt.*;

public class Scania extends Vehicle { //// change to implment and ask them

    private double Angle; /// Ask him if it's true

    private double platformAngle = 0;

    private double trimFactor = 1.25;

    private Truck truck;

    private Ramp ramp;

    public Scania(Direction direction , double x, double y) {
        super("Scania", 2, 4, 0, Color.RED, Direction.SOUTH , x, y);

    }

    public double speedFactor() {return getEnginePower() * 0.01 * trimFactor;}

    
    public boolean raisePlatform(){ //// true
        return ramp.raisePlatform();
    }

    public void lowerPlatform(int amount){
        if(truck.getCurrentSpeed() == 0 && amount <= 70 && amount >= 0) {
            platformAngle =  amount;
        }  
    }

    public double getPlatformAngle(){
        return platformAngle;
    }

    protected boolean Move(){
        return getPlatformAngle() == 0;
    }

    
    
    
    
    
    
    public void increaseAngle(double amount) 
    
    {

        double res = Angle + amount;

        if (getCurrentSpeed() == 0) {
            if ( res > 70) 
            {
                Angle = 70;
            } 
            else
            Angle = Angle + amount;
        }
    }  //override gas
        // start engien

    public void decreaseAngle(double amount) 
    {
        double res = Angle - Math.abs(amount);

        if ( res < 0) 
        {
            Angle = 0;
        } 
        else
        Angle = Angle - Math.abs(amount);
    }

    


    


   


    
    
    
}
