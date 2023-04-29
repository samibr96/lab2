import java.util.ArrayList;
import java.util.List;

public class Storage  {

    private List<Vehicle> cars;
    public double x;
    public double y;

public Storage() {
        cars = new ArrayList<Vehicle>();
    }

    public  void carloadW (Vehicle car)
    {
        double variableX = car.getX() ;
        double variableY = car.getY() ;
        if (this.x - 10 < variableX && variableX < this.x + 10 && this.y - 10 < variableY && variableY < this.y + 10 && car.getCurrentSpeed() == 0)
        {
            cars.add(car);
        }
    }

    public void carUnloadW (Vehicle car)
    {   
        cars.remove(car);
        

        
    
}
}
