import java.util.ArrayList;
import java.util.List;


public class CarRepairShop     {

    private List<Vehicle> cars;

    private Storage storage;


    public double x;
    public double y;


    private int maxNrOfCas;

    

    public CarRepairShop(int maxAmountOfCars, double x, double y) {

        cars = new ArrayList<>();
        this.maxNrOfCas = maxAmountOfCars;
        this.x = x;
        this.y = y;
        this.storage = new Storage();
    }

    public boolean isWorkShopFull() {
        return cars.size() >= maxNrOfCas;
    }

    public void carload (Vehicle car)
    {
        storage.carloadW(car);
    }

    public void carUnload (Vehicle car)
    { 
        storage.carUnloadW(car);
    }
    
    
}
