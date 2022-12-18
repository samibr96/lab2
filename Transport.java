

import java.awt.*;
import java.util.Stack;

public class Transport extends Truck

{

    private boolean platformup = true;  
    private Storage storage;
    private Truck truck;
    private Ramp ramp;


    //Deque<AllVehicles> Deque = new ArrayDeque<>();


    private Stack <Vehicle > stack = new Stack<>();


    public Transport(Direction direction , double x, double y) {
        super("Truck D50SE-5", 2, 300, 2, Color.ORANGE, direction , x, y);

    }

    public boolean raisePlatform() {
        return ramp.raisePlatform();
    }


    public void lowerPlatform() {

        ramp.lowerPlatform();        
    }

    public void loadCars(Vehicle  car) { 

        if (!platformup) 
        {
            storage.carloadW(car);
        }

    }

    public void unloadCars(Vehicle  car) {

        if (!platformup) 

        {
            storage.carUnloadW(car);
        }
       
    }

    public void move() {
        
        if (!platformup){
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

    

  
    

    
    
