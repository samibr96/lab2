

import java.awt.*;
import java.util.Stack;

public class Transport extends Truck

{

    private boolean PlatformDown;
    private double carDistance; 

    //Deque<AllVehicles> Deque = new ArrayDeque<>();


    Stack <AllVehicles> stack = new Stack<>();


    public Transport(Direction direction , double x, double y) {
        super("Truck D50SE-5", 2, 300, 2, Color.ORANGE, direction , x, y);

    }

    public void raisePlatform() {
        PlatformDown = getCurrentSpeed() != 0;
    }


    public void lowerPlatform() {
        PlatformDown = getCurrentSpeed() == 0;
    }

    private void loadCars(AllVehicles vehicle) {
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
        for (AllVehicles vehiclesStack : stack) {
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

    

  
    

    
    
