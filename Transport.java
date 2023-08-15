

import java.awt.*;
import java.util.Stack;

public class Transport extends Truck

{

    private Storage storage;
    private Ramp ramp;


    //Deque<AllVehicles> Deque = new ArrayDeque<>();


    private Stack <Vehicle > stack = new Stack<>();


    public Transport(Direction direction , double x, double y, boolean ramp) {
        super("Truck D50SE-5", 2, 300, 2, Color.ORANGE, direction , x, y, false);

        this.ramp = new Ramp(this);
        this.storage = new Storage();
        this.stack = new Stack<>();

    }

    public boolean raisePlatform() {
        return ramp.raisePlatform();
    }


    public void lowerPlatform() {

        ramp.lowerPlatform();        
    }

    public void loadCars(Vehicle  car) { 

        if (!raisePlatform()) 
        {
            storage.carloadW(car);
        }

    }

    public void unloadCars(Vehicle  car) {

        if (!raisePlatform()) 

        {
            storage.carUnloadW(car);
        }
       
    }

    public void move() {
        
        if (!raisePlatform()){
        super.move();
        
        
        for (Vehicle  vehiclesStack : stack) {
            vehiclesStack.setX(getX() + getCurrentSpeed());
            vehiclesStack.setY(getY() + getCurrentSpeed());
        }
    }
    }


    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }



    
    }

    

  
    

    
    
