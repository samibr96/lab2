
import java.awt.*;

public class Scania extends Truck {

 
    private boolean platformAngle = true; // It mean the angle if true, so the angle is 0. the angle is false, it mean 70
    private double trimFactor = 1.25;

    public Scania(Direction direction , double x, double y) {
        super("Scania", 2, 4, 0, Color.RED, Direction.SOUTH , x, y, true);

    }

    public double speedFactor() {return getEnginePower() * 0.01 * trimFactor;}

    

    public void adjPlatform(boolean amount){
        if(getCurrentSpeed() == 0 && amount == false) {
            platformAngle =  amount;
        }  
    }

    public boolean getPlatformAngle(){
        return platformAngle;
    }

    protected boolean Move(){
        return getPlatformAngle() == true;
    }
    

}
