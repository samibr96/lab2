
import java.awt.*;

public class Scania extends Vehicle {

    private double trimFactor = 1.25;

    public Scania(Direction direction , double x, double y) {
        super("Scania", 2, 4, 0, Color.RED, Direction.SOUTH , x, y);

    }

    public double speedFactor() {

        return getEnginePower() * 0.01 * trimFactor;
    }

    


    public void increaseAngle(double amount,double Angle) 
    
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
    }

    public void decreaseAngle(double amount,double Angle) 
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
