import java.util.ArrayList;
import java.util.List;


public class CarRepairShop<Car extends Vehicle> {

    private List<Car> cars;

    public double x;
    public double y;


    private int maxNrOfCas;

    

    public CarRepairShop(int maxAmountOfCars, double x, double y) {

        cars = new ArrayList<>();
        this.maxNrOfCas = maxAmountOfCars;
        this.x = x;
        this.y = y;
    }

    private boolean isWorkShopFull() {
        return cars.size() >= maxNrOfCas;
    }

    private void carloadW (Car car)
    {
        double variableX = car.getX() ;
        double variableY = car.getY() ;
        if ((variableX == (this.x - 10)) && (variableY == (this.y - 10)) && car.getCurrentSpeed() == 0 )
        {
            cars.add(car);
        }
    }

    private void carUnloadW (Car car)
    {

        double variableX = car.getX() ;
        double variableY = car.getY() ;
        if ((variableX != (this.x - 10)) && (variableY != (this.y - 10)) && car.getCurrentSpeed() == 0 )
        {
            cars.remove(car);
        }

        
    }
    
    
}
