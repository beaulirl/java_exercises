package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class CarFactory {
    public Car buildCar(CarType model){
        Car car = null;
        if(model.equals(CarType.SEDAN)){
            car = new SedanCar();
        }
        else if(model.equals(CarType.WAGON)){
            car = new WagonCar();
        }
        else if(model.equals(CarType.HATCHBACK)){
            car = new HatchBack();
        }
        return car;

    }
}
