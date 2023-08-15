public class Ramp{

    private Truck truck;
    private boolean Platformup = true; 

    public Ramp(Truck truck) {
        this.truck = truck;
        this.Platformup = true;

        }



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
