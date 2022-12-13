

import java.awt.*;
import java.util.Stack;

public class Transport extends Truck

{

    private boolean PlatformDown = false;
    private double carDistance = 0;  /// ask about that

    //Deque<AllVehicles> Deque = new ArrayDeque<>();


    Stack <Vehicle> stack = new Stack<>();


    public Transport(Direction direction , double x, double y) {
        super("Truck D50SE-5", 2, 300, 2, Color.ORANGE, direction , x, y);

    }

    public void raisePlatform() {
        PlatformDown = getCurrentSpeed() != 0;
    }


    public void lowerPlatform() {
        PlatformDown = getCurrentSpeed() == 0;
    }

    private void loadCars(Vehicle vehicle) {
        if (stack.size() < 10)
            if ((PlatformDown && 0 < carDistance) && (carDistance <= 1)) {
                stack.push(vehicle);
        } 

    }

    private void unloadCars() {
        if (PlatformDown) {
            stack.pop();
            carDistance = 1;
        }
    }

    public void move() {
        super.move();
        for (Vehicle vehiclesStack : stack) {
            vehiclesStack.setX(getX() + getCurrentSpeed());
            vehiclesStack.setY(getY() + getCurrentSpeed());
        }
    }








    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }



    
    }

    

  
    

    
    
