import java.awt.*;



public class Truck extends Vehicle  {

    private double trimFactor = 1.25;
    


    public double speedFactor() {

        return getEnginePower() * 0.01 * trimFactor;
    }

    public Truck(String modelName, int nrDoors, double enginePower, double currentSpeed, Color color, Direction direction , double x, double y) {
        super(modelName, nrDoors, enginePower, currentSpeed, color, direction , x, y);

    }

   
    
}
