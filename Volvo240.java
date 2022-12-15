import java.awt.*;


public class Volvo240 extends Vehicle  

{

    private double trimFactor = 1.25;
    
    public Volvo240(final Direction direction , final double x, final double y) {
        super("Volvo240", 4, 4, 0, Color.BLUE, direction , x, y);
    }
    

    public double speedFactor() {

        return getEnginePower() * 0.01 * trimFactor;
    }

    

}