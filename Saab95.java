import java.awt.*;


public class Saab95 extends AllVehicles 

{
   
    private boolean turboOn = false;


    public Saab95(Direction direction , double x, double y) {
        super("Saab95", 10, 4, 0, Color.BLUE, Direction.SOUTH  , x, y);

    }
    public boolean isTurboOn() {
        return turboOn;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }


    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 13;
        return getEnginePower() * 0.01 * turbo;
    }
}