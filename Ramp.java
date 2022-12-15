public class Ramp{

    private Truck truck;
    private boolean Platformup = true;  /// ask about that



    public boolean raisePlatform() {
        return Platformup;
    }



    public void lowerPlatform() {

        if (truck.getCurrentSpeed() == 0)

        { 
            Platformup = false; 
        }            
    }



    
    
}
